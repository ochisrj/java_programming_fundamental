# 1D Array ในภาษา Java — คู่มือการเรียนรู้ตั้งแต่ระดับเริ่มต้นถึงระดับสูง

> **ระดับ:** Beginner → Advanced  
> **เวอร์ชัน Java:** 8 ขึ้นไป (มีหมายเหตุเฉพาะสำหรับ Java 9 / 11 / 17 / 21 ในจุดที่แตกต่าง)  
> **สิ่งที่จะได้เรียนรู้:** แนวคิดและการจัดเก็บใน Memory, Syntax ทุกรูปแบบ, การใช้ `Arrays` utility, Pass-by-Value/Reference, สูตรคำนวณ, Complexity และโจทย์ฝึก 3 ระดับพร้อมเฉลย

---

## สารบัญ

1. [Concept & Fundamentals](#1-concept--fundamentals)
2. [Syntax & Implementation (Basic to Advanced)](#2-syntax--implementation-basic-to-advanced)
3. [Mathematical Formulas & Concepts](#3-mathematical-formulas--concepts)
4. [Code Examples & Exercises](#4-code-examples--exercises)
5. [Summary & Cheat Sheet](#5-summary--cheat-sheet)

---

## 1. Concept & Fundamentals

### 1.1 นิยามของ 1D Array

**Array (อาร์เรย์)** คือโครงสร้างข้อมูลที่เก็บข้อมูล **ชนิดเดียวกัน (Homogeneous)** จำนวน **คงที่ (Fixed Size)** เรียงต่อกันเป็นลำดับ และเข้าถึงสมาชิกแต่ละตัวได้ด้วย **Index** ซึ่งเริ่มนับที่ `0`

**1D Array (One-Dimensional Array)** คือ Array ที่ใช้ Index เพียงตัวเดียวในการอ้างอิงสมาชิก เปรียบได้กับ *ตู้ล็อกเกอร์ที่เรียงเป็นแถวเดียว* แต่ละช่องมีหมายเลขกำกับ (Index) และเก็บของชนิดเดียวกันได้ช่องละ 1 ชิ้น

```
Index:   [0]   [1]   [2]   [3]   [4]
       +-----+-----+-----+-----+-----+
Value: |  85 |  90 |  78 |  92 |  66 |     ← int[] scores (length = 5)
       +-----+-----+-----+-----+-----+
```

**คุณสมบัติสำคัญ**

| คุณสมบัติ | รายละเอียด |
|---|---|
| Homogeneous | เก็บข้อมูลได้เพียงชนิดเดียวตามที่ประกาศ เช่น `int[]` เก็บได้เฉพาะ `int` |
| Fixed Size | ขนาดถูกกำหนดตอนสร้างและ **เปลี่ยนไม่ได้** ตลอดอายุของ Array นั้น |
| Zero-based Index | สมาชิกตัวแรกคือ `arr[0]` และตัวสุดท้ายคือ `arr[arr.length - 1]` |
| Random Access | เข้าถึงสมาชิกตัวใดก็ได้ในเวลาคงที่ O(1) |
| Ordered | ลำดับของข้อมูลคงที่ตาม Index ที่กำหนด (ไม่ใช่การเรียงค่า) |

**ลักษณะเฉพาะของ Array ใน Java**

- Array เป็น **Object** (สืบทอดจาก `java.lang.Object`) แม้จะเก็บ Primitive type ก็ตาม
- มีฟิลด์ `length` (เป็น `final int`) บอกจำนวนสมาชิก
- ถูกสร้างบน **Heap** เสมอ โดยตัวแปรที่ประกาศเป็นเพียง **Reference** ที่ชี้ไปยัง Array นั้น
- สมาชิกทุกตัวถูก **กำหนดค่าเริ่มต้นให้อัตโนมัติ** (Default Value) ตอนสร้าง
- Java ตรวจสอบขอบเขต Index ทุกครั้งที่เข้าถึง (Bounds Checking) ต่างจาก C/C++ ที่อาจเข้าถึง Memory นอกขอบเขตได้โดยไม่มี Error

### 1.2 การจัดเก็บข้อมูลใน Memory (Contiguous Memory)

หัวใจของ Array คือ **การจัดเก็บสมาชิกเรียงติดกันใน Memory (Contiguous Memory Allocation)** ทำให้คำนวณตำแหน่งของสมาชิกแต่ละตัวได้ทันทีจาก Index (ดูสูตรในหัวข้อ 3.1)

#### กรณี Primitive Array (เช่น `int[]`)

```java
int[] scores = new int[5];
```

```
   Stack                      Heap
+-----------+           +---------------------------+
|  scores   |  ───────► | Header (length = 5)       |
| (ref)     |           +-----+-----+-----+-----+-----+
+-----------+           |  0  |  0  |  0  |  0  |  0  |   ← ค่าจริงอยู่ในตัว Array เลย
                        +-----+-----+-----+-----+-----+
                         [0]   [1]   [2]   [3]   [4]
Address (สมมติ):        1016  1020  1024  1028  1032     ← ห่างกันทีละ 4 byte (ขนาดของ int)
```

#### กรณี Object Array (เช่น `String[]`)

```java
String[] names = new String[3];
names[0] = "Ann";
names[1] = "Bob";
```

```
   Stack                     Heap
+-----------+         +-------------------------+
|  names    | ──────► | Header (length = 3)     |
+-----------+         +--------+--------+-------+
                      | ref ───┼─ ref ──┼─ null |      ← Array เก็บ "Reference" เรียงติดกัน
                      +---┬----+---┬----+-------+
                          │        │
                          ▼        ▼
                      "Ann"     "Bob"                   ← ตัว Object จริงกระจายอยู่ที่ใดใน Heap ก็ได้
```

> **จุดที่มักเข้าใจผิด:** `new String[3]` **ไม่ได้สร้าง String 3 ตัว** แต่สร้างช่องเก็บ Reference 3 ช่อง ซึ่งเริ่มต้นเป็น `null` ทั้งหมด

**ผลที่ตามมาจากการเก็บแบบ Contiguous**

1. **Random Access แบบ O(1):** คำนวณ Address ได้ทันทีด้วยการคูณและบวก
2. **Cache Locality ดีเยี่ยม:** CPU โหลดข้อมูลทีละ Cache Line (ประมาณ 64 byte) การวนลูปอ่านสมาชิกที่อยู่ติดกันจึงเร็วมาก เพราะข้อมูลถัดไปมักถูกโหลดมารอใน Cache แล้ว (Primitive Array ได้เปรียบที่สุด)
3. **ขยายขนาดในที่เดิมไม่ได้:** เพราะพื้นที่ถัดไปอาจถูกใช้งานโดยข้อมูลอื่น จึงต้องสร้าง Array ใหม่แล้วคัดลอก
4. **ต้องการพื้นที่ว่างต่อเนื่อง:** Array ขนาดใหญ่มากอาจสร้างไม่สำเร็จ แม้ Memory รวมจะเหลือพอ (เกิด `OutOfMemoryError`)

### 1.3 ข้อดี-ข้อเสียของ Array

| ข้อดี | ข้อเสีย |
|---|---|
| เข้าถึงสมาชิกด้วย Index ได้เร็ว O(1) | ขนาดคงที่ ขยายหรือหดไม่ได้ |
| ใช้ Memory ประหยัด ไม่มี Overhead ต่อสมาชิก (โดยเฉพาะ Primitive) | Insert / Delete ตรงกลางต้องเลื่อนสมาชิก O(n) |
| Cache-friendly ทำให้วนลูปได้เร็วมากในทางปฏิบัติ | เก็บได้ชนิดเดียว (ไม่ยืดหยุ่นเท่า Collection) |
| รองรับ Primitive Type โดยตรง (ไม่ต้อง Boxing) | ค้นหาข้อมูลใน Array ที่ไม่เรียงต้อง O(n) |
| Syntax เรียบง่าย และมี `Arrays` utility ช่วยหลายอย่าง | ไม่มี Method ในตัว (เช่น `add`, `remove`, `contains`) |

#### เปรียบเทียบกับ Data Structure อื่น

| เกณฑ์ | `int[]` / `T[]` (Array) | `ArrayList<T>` | `LinkedList<T>` | `HashSet<T>` / `HashMap<K,V>` |
|---|---|---|---|---|
| ขนาด | คงที่ | ปรับได้อัตโนมัติ | ปรับได้อัตโนมัติ | ปรับได้อัตโนมัติ |
| เข้าถึงด้วย Index | **O(1)** | **O(1)** | O(n) | ไม่มี Index |
| ค้นหาค่า (Unsorted) | O(n) | O(n) | O(n) | **O(1)** โดยเฉลี่ย |
| เพิ่มท้ายรายการ | ทำไม่ได้ (ต้องสร้างใหม่) | O(1) แบบ Amortized | O(1) | O(1) โดยเฉลี่ย |
| Insert / Delete ตรงกลาง | O(n) | O(n) | O(1) *ถ้ามี Node อ้างอิงอยู่แล้ว* (ถ้าต้องหาก่อนคือ O(n)) | O(1) โดยเฉลี่ย |
| เก็บ Primitive โดยตรง | ✅ ได้ | ❌ ต้อง Boxing (`Integer`) | ❌ ต้อง Boxing | ❌ ต้อง Boxing |
| Memory Overhead | ต่ำที่สุด | ปานกลาง | สูง (Node + 2 pointers) | สูง |
| Cache Locality | ดีที่สุด | ดี (เก็บ Reference ติดกัน) | แย่ | แย่ |
| รักษาลำดับ | ✅ | ✅ | ✅ | ❌ (`HashSet`/`HashMap`) |

**เลือกใช้ Array เมื่อ**

- ทราบขนาดข้อมูลแน่นอนล่วงหน้า (หรือเปลี่ยนแปลงน้อยมาก)
- ต้องการประสิทธิภาพสูงสุดกับข้อมูล Primitive จำนวนมาก
- ต้องการเข้าถึงด้วย Index บ่อย ๆ (เช่น Lookup Table, Buffer, Algorithm Problem)

**เลือก Collection (`ArrayList` ฯลฯ) เมื่อ** ขนาดข้อมูลเปลี่ยนแปลงบ่อย หรือต้องการ Method อำนวยความสะดวกอย่าง `add`, `remove`, `contains`

---

## 2. Syntax & Implementation (Basic to Advanced)

### 2.1 การประกาศ (Declaration), การสร้าง (Instantiation) และการกำหนดค่า (Initialization)

การสร้าง Array มี 3 ขั้นตอน ซึ่งสามารถแยกทำหรือรวมกันก็ได้

| ขั้นตอน | ความหมาย | ตัวอย่าง |
|---|---|---|
| Declaration | ประกาศตัวแปร Reference | `int[] arr;` |
| Instantiation | จองพื้นที่ใน Heap ด้วย `new` | `arr = new int[5];` |
| Initialization | ใส่ค่าให้สมาชิก | `arr[0] = 10;` |

```java
// ---------- 1) Declaration (ประกาศเฉย ๆ ยังไม่มี Array จริง) ----------
int[] numbers;          // ✅ รูปแบบที่แนะนำ (Java style): ชนิดข้อมูลคือ "int[]"
int numbers2[];         // ⚠️ ใช้ได้ (C style) แต่ไม่แนะนำ อ่านยากกว่า

// ---------- 2) Instantiation (จองพื้นที่ ขนาด 5 ช่อง) ----------
numbers = new int[5];   // ทุกช่องเป็นค่า Default (0)

// ---------- 3) รวม Declaration + Instantiation ในบรรทัดเดียว ----------
double[] prices = new double[3];      // {0.0, 0.0, 0.0}
String[] names  = new String[4];      // {null, null, null, null}

// ---------- 4) Array Initializer: กำหนดค่าตั้งแต่ตอนสร้าง (ขนาดถูกกำหนดจากจำนวนค่า) ----------
int[] a = {10, 20, 30};               // ✅ แบบสั้น ใช้ได้เฉพาะตอน "ประกาศ" เท่านั้น
int[] b = new int[]{10, 20, 30};      // ✅ แบบเต็ม ใช้ได้ทุกที่ (เช่น ส่งเป็น argument)

int[] c;
// c = {1, 2, 3};                     // ❌ Compile Error: แบบสั้นใช้แยกบรรทัดไม่ได้
c = new int[]{1, 2, 3};               // ✅ ต้องใช้แบบเต็ม

// int[] d = new int[3]{1, 2, 3};     // ❌ Compile Error: ห้ามระบุทั้งขนาดและค่าพร้อมกัน

// ---------- 5) ขนาดกำหนดตอน Runtime ได้ ----------
int n = 8;
int[] dynamicSize = new int[n];       // ✅ ขนาดจากตัวแปร (แต่เมื่อสร้างแล้วเปลี่ยนไม่ได้)

// ---------- 6) ใช้ var (Java 10+) ----------
var e = new int[]{1, 2, 3};           // ✅ infer เป็น int[]
// var f = {1, 2, 3};                 // ❌ Compile Error: var ใช้กับ Initializer แบบสั้นไม่ได้
```

#### ค่า Default ของสมาชิกใน Array

| ชนิดข้อมูล | ค่า Default |
|---|---|
| `byte`, `short`, `int`, `long` | `0` |
| `float`, `double` | `0.0` |
| `char` | `'\u0000'` (Null character) |
| `boolean` | `false` |
| Reference (`String`, `Object`, `int[]` ฯลฯ) | `null` |

#### การกำหนดค่าเริ่มต้นแบบอื่น ๆ

```java
import java.util.Arrays;

int[] filled = new int[5];
Arrays.fill(filled, -1);                    // {-1, -1, -1, -1, -1}

int[] squares = new int[5];
Arrays.setAll(squares, i -> i * i);         // {0, 1, 4, 9, 16}  (Java 8+)

// กำหนดค่าด้วย Loop
int[] evens = new int[5];
for (int i = 0; i < evens.length; i++) {
    evens[i] = i * 2;                       // {0, 2, 4, 6, 8}
}
```

> **หมายเหตุ:** ขนาดติดลบ (`new int[-1]`) จะเกิด `NegativeArraySizeException` ตอน Runtime

### 2.2 การเข้าถึงข้อมูล (Indexing)

```java
int[] arr = {10, 20, 30, 40, 50};

int first = arr[0];                    // 10  (ตัวแรก)
int last  = arr[arr.length - 1];       // 50  (ตัวสุดท้าย)
arr[2] = 99;                           // แก้ไขค่า → {10, 20, 99, 40, 50}

int i = 3;
System.out.println(arr[i]);            // Index เป็นตัวแปรหรือ Expression ก็ได้ (40)
System.out.println(arr[i - 1]);        // 99
```

**กฎของ Index**

- ต้องเป็นชนิด `int` (หรือชนิดที่ขยายเป็น `int` ได้ เช่น `byte`, `short`, `char`) — ใช้ `long` เป็น Index **ไม่ได้**
- ช่วงที่ถูกต้องคือ `0 ≤ index ≤ length - 1`
- Index ที่อยู่นอกช่วงจะเกิด `ArrayIndexOutOfBoundsException` ตอน Runtime (ไม่ใช่ Compile Error)

### 2.3 การวนลูปอ่านค่า (Iteration)

#### 2.3.1 Standard `for` Loop — ควบคุม Index ได้เต็มที่

```java
int[] arr = {5, 3, 8, 1, 9};

for (int i = 0; i < arr.length; i++) {          // เงื่อนไขคือ "<" ไม่ใช่ "<="
    System.out.println("arr[" + i + "] = " + arr[i]);
}

// วนย้อนกลับ
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");             // 9 1 8 3 5
}

// วนข้ามทีละ 2 (เฉพาะ Index คู่)
for (int i = 0; i < arr.length; i += 2) {
    System.out.print(arr[i] + " ");             // 5 8 9
}
```

**เหมาะเมื่อ:** ต้องใช้ Index, ต้องแก้ไขค่าใน Array, วนย้อนกลับ, วนหลายตัวพร้อมกัน (เช่น Two Pointers)

#### 2.3.2 Enhanced `for` Loop (for-each) — อ่านง่าย ปลอดภัยเรื่อง Index

```java
for (int value : arr) {
    System.out.print(value + " ");              // 5 3 8 1 9
}
```

**ข้อจำกัดที่ต้องรู้**

```java
int[] nums = {1, 2, 3};

// ❌ ไม่สามารถแก้ไขค่าใน Array ผ่านตัวแปร Loop ของ Primitive ได้
for (int x : nums) {
    x = x * 2;                                  // แก้แค่สำเนาใน x (nums ยังเป็น {1, 2, 3})
}

// ✅ ถ้าต้องแก้ไขค่า ให้ใช้ Index
for (int i = 0; i < nums.length; i++) {
    nums[i] = nums[i] * 2;                      // nums = {2, 4, 6}
}
```

- ไม่มี Index ให้ใช้ (ถ้าต้องการต้องสร้างตัวนับเอง)
- วนได้ทิศทางเดียว (ไปข้างหน้า) และเริ่มจากตัวแรกเสมอ
- กรณี Object Array: แก้ไข **สถานะภายใน** ของ Object ได้ (เพราะ Reference ชี้ Object เดียวกัน) แต่กำหนด Reference ใหม่ให้ตัวแปร Loop ไม่มีผลกับ Array

#### 2.3.3 Stream API (Java 8+) — แนวทาง Functional

```java
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

int[] nums = {5, 3, 8, 1, 9, 4};

// สร้าง IntStream จาก int[] แล้วคำนวณค่าสถิติ
int sum        = Arrays.stream(nums).sum();                          // 30
double average = Arrays.stream(nums).average().orElse(0.0);         // 5.0
int max        = Arrays.stream(nums).max().getAsInt();              // 9
int min        = Arrays.stream(nums).min().getAsInt();              // 1
long countBig  = Arrays.stream(nums).filter(n -> n > 4).count();    // 3 (5, 8, 9)

// Transform: คืนค่าเป็น Array ใหม่ (ไม่แก้ Array เดิม)
int[] evens   = Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();   // {8, 4}
int[] squares = Arrays.stream(nums).map(n -> n * n).toArray();           // {25, 9, 64, 1, 81, 16}

// วนแบบมี Index
IntStream.range(0, nums.length)
         .forEach(i -> System.out.println("nums[" + i + "] = " + nums[i]));

// แปลงเป็น String
String text = Arrays.stream(nums)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(", "));              // "5, 3, 8, 1, 9, 4"

// Array ของ Object ใช้ Arrays.stream(T[]) ได้เช่นกัน
String[] words = {"java", "array", "stream"};
Arrays.stream(words).map(String::toUpperCase).forEach(System.out::println);
```

**ข้อควรรู้:** `Arrays.stream(int[])` คืน `IntStream` (Primitive Stream ไม่มี Boxing) ส่วน `Arrays.stream(String[])` คืน `Stream<String>` ตัวแปรที่ใช้ใน Lambda ต้องเป็น *effectively final* และ Stream มี Overhead เล็กน้อย จึงอาจช้ากว่า `for` ธรรมดาในงานที่ข้อมูลน้อยมากหรือต้องการ Performance สูงสุด

#### เปรียบเทียบวิธีวนลูป

| วิธี | ใช้ Index | แก้ค่าใน Array | อ่านง่าย | เหมาะกับ |
|---|:---:|:---:|:---:|---|
| `for` | ✅ | ✅ | ปานกลาง | Algorithm, ต้องควบคุมตำแหน่ง |
| Enhanced `for` | ❌ | ❌ (Primitive) | สูง | อ่านค่าอย่างเดียว |
| Stream API | ผ่าน `IntStream.range` | ❌ (สร้าง Array ใหม่) | สูง (แนว Declarative) | สรุปผล/กรอง/แปลงข้อมูล |

### 2.4 ข้อควรระวัง (Pitfalls)

#### 2.4.1 `ArrayIndexOutOfBoundsException`

เกิดเมื่อใช้ Index นอกช่วง `0` ถึง `length - 1`

```java
int[] arr = new int[5];         // Index ที่ใช้ได้: 0, 1, 2, 3, 4

arr[5] = 100;                   // ❌ ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
arr[-1] = 100;                  // ❌ ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5

int[] empty = {};
System.out.println(empty[0]);   // ❌ Array ว่าง (length = 0) ไม่มี Index ใดใช้ได้เลย
```

> ข้อความ Error ในรูปแบบ `Index 5 out of bounds for length 5` เป็นรูปแบบของ JDK รุ่นใหม่ (11 ขึ้นไป) รุ่นเก่าอาจแสดงเพียง `5`

**สาเหตุที่พบบ่อยและวิธีป้องกัน**

| สาเหตุ | ตัวอย่างที่ผิด | วิธีแก้ |
|---|---|---|
| Off-by-one ใน Loop | `for (int i = 0; i <= arr.length; i++)` | ใช้ `i < arr.length` |
| เข้าถึงตัวสุดท้ายผิด | `arr[arr.length]` | ใช้ `arr[arr.length - 1]` |
| ไม่เช็ก Array ว่าง | `arr[0]` เมื่อ `length == 0` | ตรวจ `arr.length > 0` ก่อน |
| Index มาจากการคำนวณ | `arr[i + 1]` ตอน `i` เป็นตัวสุดท้าย | ให้ Loop วนถึง `length - 1` |
| Index มาจากผู้ใช้ | `arr[userInput]` | Validate: `0 <= idx && idx < arr.length` |

```java
// ตัวอย่างการตรวจสอบก่อนเข้าถึง
static int safeGet(int[] arr, int index, int defaultValue) {
    if (arr == null || index < 0 || index >= arr.length) {
        return defaultValue;
    }
    return arr[index];
}
```

**ข้อยกเว้น (Exception) อื่นที่เกี่ยวข้องกับ Array**

```java
int[] a = null;
System.out.println(a.length);          // ❌ NullPointerException (Reference ยังไม่ชี้ Array ใด ๆ)

int[] b = new int[-3];                 // ❌ NegativeArraySizeException

Object[] objs = new String[2];         // Array ใน Java เป็น Covariant
objs[0] = 42;                          // ❌ ArrayStoreException (Compile ผ่าน แต่ Runtime Error)

String[] names = new String[3];
System.out.println(names[0].length()); // ❌ NullPointerException (สมาชิกเป็น null)
```

> **แนวปฏิบัติ:** อย่าใช้ `try-catch` ดัก `ArrayIndexOutOfBoundsException` เพื่อควบคุม Flow ปกติของโปรแกรม ให้ตรวจเงื่อนไขก่อนเสมอ ส่วน Exception นี้ควรเป็นสัญญาณของ Bug ที่ต้องแก้ที่ต้นเหตุ

#### 2.4.2 Memory Management

1. **Array อยู่บน Heap:** ตัวแปร Local เก็บเพียง Reference (บน Stack) ส่วนตัว Array จริงอยู่บน Heap และถูก **Garbage Collector (GC)** เก็บคืนอัตโนมัติเมื่อไม่มี Reference ใดชี้แล้ว

   ```java
   int[] big = new int[1_000_000];   // ~4 MB บน Heap
   big = null;                        // ไม่มี Reference ชี้แล้ว → เข้าข่ายถูก GC เก็บคืนได้
   ```

2. **ขนาดคงที่ → ต้อง "สร้างใหม่แล้วคัดลอก" เมื่อต้องการขยาย**

   ```java
   int[] old = {1, 2, 3};
   int[] bigger = Arrays.copyOf(old, old.length * 2);   // {1, 2, 3, 0, 0, 0}
   ```

3. **Primitive Array vs Wrapper Array:** `Integer[]` กิน Memory มากกว่า `int[]` หลายเท่า เพราะแต่ละสมาชิกเป็น Reference ไปยัง Object `Integer` แยกต่างหาก

   | ชนิด (1 ล้านสมาชิก) | Memory โดยประมาณ* |
   |---|---|
   | `int[]` | ≈ 4 MB |
   | `Integer[]` | ≈ 4 MB (Reference) + ≈ 16 MB (Object `Integer` 1 ล้านตัว) = **≈ 20 MB** |

   \* ค่าประมาณสำหรับ HotSpot 64-bit ที่เปิด Compressed OOPs (ค่า Default) และไม่นับกรณี `Integer` Cache สำหรับค่า -128 ถึง 127

4. **`OutOfMemoryError`:** การสร้าง Array ใหญ่เกิน Heap ที่มี จะเกิด `java.lang.OutOfMemoryError: Java heap space` (หรือ `Requested array size exceeds VM limit` เมื่อขอขนาดใกล้ `Integer.MAX_VALUE`) ปรับ Heap ได้ด้วย `-Xmx`

5. **Memory Leak แบบไม่รู้ตัว:** ถ้าใช้ Array เป็นฐานของ Stack/Queue ที่เขียนเอง เมื่อ `pop` ต้องเซ็ตช่องนั้นเป็น `null` ด้วย มิฉะนั้น Array ยังถือ Reference ไปยัง Object เก่าไว้ทำให้ GC เก็บไม่ได้

   ```java
   Object pop() {
       Object item = data[--size];
       data[size] = null;          // ✅ ปล่อย Reference เพื่อให้ GC ทำงานได้
       return item;
   }
   ```

6. **Object Array เก็บ Reference:** Array ที่เต็มไปด้วย `null` ยังกิน Memory ตามจำนวนช่อง (ช่องละ 4 หรือ 8 byte)

### 2.5 Advanced Topics

#### 2.5.1 `java.util.Arrays` Utility Class

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
```

**`Arrays.toString()` — แสดงเนื้อหา Array**

```java
int[] arr = {5, 2, 9, 1};
System.out.println(arr);                    // ❌ พิมพ์ได้ประมาณ [I@1b6d3586 (ชนิด + Hash) ไม่ใช่ค่าใน Array
System.out.println(Arrays.toString(arr));   // ✅ [5, 2, 9, 1]
```

**`Arrays.sort()` — เรียงลำดับ**

```java
int[] nums = {5, 2, 9, 1, 7};
Arrays.sort(nums);                          // เรียงน้อย → มาก (แก้ Array เดิมโดยตรง)
System.out.println(Arrays.toString(nums));  // [1, 2, 5, 7, 9]

// เรียงเฉพาะช่วง [fromIndex, toIndex) โดย toIndex ไม่ถูกรวม
int[] part = {9, 8, 7, 6, 5};
Arrays.sort(part, 1, 4);                    // เรียง Index 1..3
System.out.println(Arrays.toString(part));  // [9, 6, 7, 8, 5]

// เรียงมาก → น้อย: ต้องใช้ Wrapper Array (Comparator ใช้กับ int[] ไม่ได้)
Integer[] boxed = {5, 2, 9, 1, 7};
Arrays.sort(boxed, Collections.reverseOrder());
System.out.println(Arrays.toString(boxed)); // [9, 7, 5, 2, 1]

// เรียง Object ด้วย Comparator
String[] words = {"banana", "kiwi", "apple"};
Arrays.sort(words, (x, y) -> x.length() - y.length());   // เรียงตามความยาว
System.out.println(Arrays.toString(words));               // [kiwi, apple, banana]
```

> **เบื้องหลัง:** Primitive Array ใช้ *Dual-Pivot Quicksort* ส่วน Object Array ใช้ *TimSort* (Stable) โดยทั่วไปมี Time Complexity เฉลี่ย **O(n log n)**

**`Arrays.binarySearch()` — ค้นหาแบบแบ่งครึ่ง (ต้องเรียงลำดับก่อนเท่านั้น!)**

```java
int[] sorted = {1, 3, 5, 7, 9};

int found    = Arrays.binarySearch(sorted, 7);   //  3  → พบที่ Index 3
int notFound = Arrays.binarySearch(sorted, 4);   // -3  → ไม่พบ
// กรณีไม่พบ ผลลัพธ์ = -(insertionPoint) - 1
// 4 ควรแทรกที่ Index 2 → -(2) - 1 = -3
int insertionPoint = -notFound - 1;              //  2
```

> ⚠️ ถ้า Array **ไม่ได้เรียงลำดับ** ผลลัพธ์จะ **ไม่สามารถคาดเดาได้** (Undefined) และถ้ามีค่าซ้ำหลายตัว ไม่การันตีว่าจะคืน Index ใด

**`Arrays.copyOf()` และ `Arrays.copyOfRange()` — คัดลอก Array**

```java
int[] src = {1, 2, 3, 4, 5};

int[] bigger  = Arrays.copyOf(src, 8);          // [1, 2, 3, 4, 5, 0, 0, 0]  (เติมค่า Default)
int[] smaller = Arrays.copyOf(src, 3);          // [1, 2, 3]                 (ตัดส่วนเกิน)
int[] range   = Arrays.copyOfRange(src, 1, 4);  // [2, 3, 4]                 (Index 1..3, ตัวท้ายไม่รวม)
```

**Method อื่น ๆ ที่ควรรู้**

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};

System.out.println(a == b);                  // false  (เทียบ Reference)
System.out.println(a.equals(b));             // false  (Array ไม่ได้ Override equals)
System.out.println(Arrays.equals(a, b));     // true   (เทียบเนื้อหาทีละตัว)

Arrays.fill(a, 7);                           // [7, 7, 7]
System.out.println(Arrays.hashCode(b));      // Hash จากเนื้อหา (ไม่ใช่ตำแหน่ง Memory)

// Arrays.asList: ทำงานกับ Object Array
Integer[] boxedArr = {1, 2, 3};
List<Integer> view = Arrays.asList(boxedArr);   // List ขนาดคงที่ที่ "เป็น View" ของ boxedArr
// ⚠️ Arrays.asList(int[]) ได้ List<int[]> (มี 1 สมาชิก) ไม่ใช่ List<Integer>

// Java 9+: หา Index แรกที่สมาชิกต่างกัน (-1 ถ้าเหมือนกันทั้งหมด)
System.out.println(Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2, 9}));   // 2
```

| Method | หน้าที่ | Complexity โดยทั่วไป |
|---|---|---|
| `Arrays.toString(arr)` | แปลงเป็น String | O(n) |
| `Arrays.sort(arr)` | เรียงลำดับ | O(n log n) |
| `Arrays.binarySearch(arr, key)` | ค้นหาใน Array ที่เรียงแล้ว | O(log n) |
| `Arrays.copyOf(arr, newLen)` | คัดลอก/เปลี่ยนขนาด | O(n) |
| `Arrays.copyOfRange(arr, from, to)` | คัดลอกบางช่วง | O(to − from) |
| `Arrays.fill(arr, val)` | ใส่ค่าเดียวกันทุกช่อง | O(n) |
| `Arrays.equals(a, b)` | เทียบเนื้อหา | O(n) |
| `Arrays.setAll(arr, fn)` | กำหนดค่าด้วยฟังก์ชันของ Index | O(n) |
| `System.arraycopy(...)` | คัดลอกช่วงระหว่าง Array (Native, เร็ว) | O(length) |

**`System.arraycopy()`** เหมาะกับงานเลื่อนสมาชิก (Shift) ใน Array เดียวกัน เพราะรองรับช่วงที่ซ้อนทับกันได้ถูกต้อง

```java
// System.arraycopy(src, srcPos, dest, destPos, length)
int[] data = {1, 2, 3, 4, 5, 0};
System.arraycopy(data, 1, data, 2, 4);          // เลื่อน Index 1..4 ไปทางขวา 1 ช่อง
// data = [1, 2, 2, 3, 4, 5]  → ว่างช่อง Index 1 ไว้แทรกค่าใหม่
```

**Varargs — Array ในรูปแบบพารามิเตอร์**

```java
static int sum(int... numbers) {          // "numbers" มีชนิดจริงเป็น int[]
    int total = 0;
    for (int n : numbers) total += n;
    return total;
}

sum();               // 0
sum(1, 2, 3);        // 6
sum(new int[]{4, 5}); // 9  (ส่ง Array ตรง ๆ ได้)
```

#### 2.5.2 Pass-by-Reference (จริง ๆ แล้วคือ Pass-by-Value ของ Reference)

> **ความจริงที่ต้องจำ:** ภาษา Java เป็น **Pass-by-Value เสมอ** สำหรับ Array สิ่งที่ถูกคัดลอกส่งเข้า Method คือ **ค่าของ Reference (Address)** ไม่ใช่ตัว Array ผลลัพธ์จึง *ดูเหมือน* Pass-by-Reference ในบางกรณี

```
main():    data ──┐
                  ├────►  [ 1 | 2 | 3 ]      ← Array มี "ชุดเดียว" บน Heap
method():  arr  ──┘                            (ตัวแปร 2 ตัว ชี้ Object เดียวกัน)
```

```java
public class PassByValueDemo {

    // 1) แก้ไข "สมาชิก" ผ่าน Reference → ส่งผลกับ Array ของผู้เรียก
    static void modifyElement(int[] arr) {
        arr[0] = 999;
    }

    // 2) เปลี่ยน "Reference" ที่เป็นสำเนา → ไม่ส่งผลกับตัวแปรของผู้เรียก
    static void reassign(int[] arr) {
        arr = new int[]{7, 7, 7};          // arr ชี้ Array ใหม่ (เฉพาะใน Method นี้)
    }

    // 3) Swap Reference ภายใน Method ไม่ทำให้ตัวแปรภายนอกสลับกัน
    static void swapWrong(int[] x, int[] y) {
        int[] temp = x;
        x = y;
        y = temp;                          // สลับแค่สำเนาภายใน
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3};

        modifyElement(data);
        System.out.println(java.util.Arrays.toString(data));   // [999, 2, 3]  ← ถูกแก้ไข

        reassign(data);
        System.out.println(java.util.Arrays.toString(data));   // [999, 2, 3]  ← ไม่เปลี่ยน

        int[] p = {1}, q = {2};
        swapWrong(p, q);
        System.out.println(p[0] + ", " + q[0]);                // 1, 2        ← ไม่สลับ
    }
}
```

**การคัดลอก Array: Assignment vs Copy**

```java
int[] original = {1, 2, 3};

int[] alias = original;                    // ❌ ไม่ใช่การคัดลอก! ชี้ Array เดียวกัน
alias[0] = 100;
System.out.println(original[0]);           // 100  ← original ถูกแก้ไขด้วย

int[] copy1 = original.clone();            // ✅ สำเนาใหม่
int[] copy2 = Arrays.copyOf(original, original.length);   // ✅
int[] copy3 = new int[original.length];
System.arraycopy(original, 0, copy3, 0, original.length); // ✅
```

**Shallow Copy กับ Object Array:** วิธีข้างต้นคัดลอกเพียง **Reference** ไม่ได้ Clone ตัว Object ข้างใน ดังนั้นสำเนากับต้นฉบับยังใช้ Object ตัวเดียวกันร่วมกัน (ถ้าต้องการอิสระต่อกันต้องทำ Deep Copy เอง)

**`final` กับ Array:** `final int[] arr = {1, 2};` ห้ามกำหนด `arr = ...` ใหม่ แต่ **แก้ `arr[0] = 5` ได้** เพราะ `final` ล็อกที่ Reference ไม่ได้ล็อกเนื้อหา

---

## 3. Mathematical Formulas & Concepts

### 3.1 สูตรการคำนวณ Memory Address ของ Index `i`

เพราะสมาชิกทุกตัวเรียงติดกันและมีขนาดเท่ากัน เราจึงคำนวณตำแหน่งของ `arr[i]` ได้ทันทีโดยไม่ต้องไล่ดูทีละตัว

```
Address(arr[i]) = Base Address + (i × Element Size)
```

| สัญลักษณ์ | ความหมาย |
|---|---|
| `Base Address` | Address ของสมาชิกตัวแรก `arr[0]` |
| `i` | Index ของสมาชิกที่ต้องการ (เริ่มที่ 0) |
| `Element Size` | ขนาดของสมาชิก 1 ตัว หน่วยเป็น byte |

**ตัวอย่างที่ 1:** `int[]` (`Element Size` = 4 byte), `Base Address` = 1000

| Index `i` | คำนวณ | Address |
|:---:|---|:---:|
| 0 | 1000 + (0 × 4) | 1000 |
| 1 | 1000 + (1 × 4) | 1004 |
| 2 | 1000 + (2 × 4) | 1008 |
| 5 | 1000 + (5 × 4) | 1020 |
| 99 | 1000 + (99 × 4) | 1396 |

**ตัวอย่างที่ 2:** `double[]` (`Element Size` = 8 byte), `Base Address` = 2000 ต้องการ `arr[7]`

```
Address = 2000 + (7 × 8) = 2000 + 56 = 2056
```

**สูตรที่เกี่ยวข้อง**

```
Address ของสมาชิกตัวสุดท้าย   = Base + ((n − 1) × Element Size)
Address ถัดจากสมาชิกตัวสุดท้าย = Base + (n × Element Size)        ← จุดสิ้นสุด (Exclusive)
ขนาดข้อมูลรวม (เฉพาะสมาชิก)   = n × Element Size
```

**สูตรทั่วไปเมื่อ Index เริ่มที่ค่าอื่น (Lower Bound = LB)** — พบในบางภาษา เช่น Pascal

```
Address(arr[i]) = Base + ((i − LB) × Element Size)
```

สำหรับ Java (และ C) ค่า `LB = 0` จึงเหลือเพียง `Base + (i × Element Size)` ซึ่งเป็นเหตุผลที่ **Index เริ่มที่ 0**: สมาชิกตัวแรกมี Offset เป็น `0 × Element Size = 0` พอดี

**ทำไม Access จึงเป็น O(1)?** เพราะการคำนวณต้องใช้ *การคูณ 1 ครั้ง + การบวก 1 ครั้ง* ไม่ว่า Array จะมี 10 หรือ 10 ล้านสมาชิก

#### ขนาดของสมาชิกตามชนิดข้อมูลใน Java

| ชนิดข้อมูล | ขนาด (byte) |
|---|:---:|
| `byte` | 1 |
| `boolean` | 1 *(ใน `boolean[]` ส่วนใหญ่ใช้ 1 byte/ช่อง ขึ้นกับ JVM)* |
| `short`, `char` | 2 |
| `int`, `float` | 4 |
| `long`, `double` | 8 |
| Reference (`String[]`, `Object[]` ฯลฯ) | 4 หรือ 8 *(4 เมื่อเปิด Compressed OOPs ซึ่งเป็นค่า Default บน HotSpot 64-bit ที่ Heap ไม่ใหญ่มาก)* |

> **ข้อควรรู้เกี่ยวกับ JVM จริง**
> - สูตรข้างต้นเป็นแบบจำลอง (Model) ที่ใช้อธิบาย โดย `Base Address` หมายถึงตำแหน่งของ `arr[0]` ซึ่งในทางปฏิบัติจะอยู่ถัดจาก **Object Header** (บน HotSpot 64-bit ทั่วไปประมาณ 16 byte ประกอบด้วย mark word, class pointer และ `length`)
> - Java ไม่ให้โปรแกรมเมอร์เข้าถึง Address จริงได้โดยตรง และ GC อาจ *ย้าย* Object ไปที่อื่นได้ ดังนั้น Address ที่ตัวเลขข้างต้นเป็นเพียงการอธิบายกลไก ไม่ใช่ค่าที่โปรแกรมอ่านได้

### 3.2 สูตรการหาขนาดความยาวของ Array (`array.length`)

```java
int[] arr = new int[10];
System.out.println(arr.length);     // 10
```

- `length` เป็น **ฟิลด์ (field)** แบบ `final int` ของ Array **ไม่มีวงเล็บ** ต่างจาก Method ของชนิดอื่น
- ค่านี้ถูกกำหนดตอนสร้าง Array และ **เปลี่ยนไม่ได้**
- การอ่าน `arr.length` เป็น O(1)

| ชนิด | วิธีหาจำนวนสมาชิก |
|---|---|
| Array (`int[]`, `String[]` ฯลฯ) | `arr.length` (ฟิลด์) |
| `String` | `s.length()` (Method) |
| `ArrayList`, `List` | `list.size()` (Method) |

**สูตรที่เกี่ยวกับความยาวและ Index**

| สิ่งที่ต้องการ | สูตร | ตัวอย่าง (`length` = 10) |
|---|---|---|
| Index ตัวแรก | `0` | `0` |
| Index ตัวสุดท้าย | `length − 1` | `9` |
| ช่วง Index ที่ใช้ได้ | `0 ≤ i ≤ length − 1` (หรือ `0 ≤ i < length`) | `0..9` |
| จำนวนสมาชิกจาก Index `low` ถึง `high` (รวมทั้งสองฝั่ง) | `high − low + 1` | `low=3, high=7` → `5` |
| Index กึ่งกลาง (ปลอดภัยจาก Overflow) | `mid = low + (high − low) / 2` | `low=0, high=9` → `4` |
| ขนาด Memory ของ Array (ประมาณ) | `align8(Header + length × Element Size)` | ดูตัวอย่างด้านล่าง |
| จำนวนรอบ Swap เมื่อกลับ Array | `⌊length / 2⌋` | `5` |
| จำนวนการเลื่อนสมาชิกเมื่อ Insert ที่ Index `k` | `n − k` | `k=0` → `10` |
| จำนวนการเลื่อนสมาชิกเมื่อ Delete ที่ Index `k` | `n − k − 1` | `k=0` → `9` |

> **ทำไมใช้ `low + (high − low) / 2` แทน `(low + high) / 2`?** เพราะ `low + high` อาจเกินค่าสูงสุดของ `int` (2,147,483,647) เมื่อ Array ใหญ่มาก ทำให้เกิด Integer Overflow ได้

**ตัวอย่างการประมาณ Memory** (HotSpot 64-bit, Header ≈ 16 byte, Alignment 8 byte)

| Array | คำนวณ | ขนาดโดยประมาณ |
|---|---|:---:|
| `new int[10]` | 16 + 10×4 = 56 | 56 byte |
| `new long[3]` | 16 + 3×8 = 40 | 40 byte |
| `new byte[10]` | 16 + 10 = 26 → ปัดขึ้นเป็นพหุคูณของ 8 | 32 byte |

**ขีดจำกัดของขนาด:** เนื่องจาก `length` เป็น `int` จำนวนสมาชิกสูงสุดในทางทฤษฎีจึงไม่เกิน `Integer.MAX_VALUE` (2³¹ − 1) และในทางปฏิบัติ JVM จะจำกัดต่ำกว่านั้นเล็กน้อย

### 3.3 Time & Space Complexity

#### ตารางสรุป Time Complexity

| Operation | Best Case | Average Case | Worst Case | Auxiliary Space |
|---|:---:|:---:|:---:|:---:|
| **Access** (`arr[i]`) | O(1) | O(1) | O(1) | O(1) |
| **Search — Linear** (Array ไม่เรียง) | O(1) | O(n) | O(n) | O(1) |
| **Search — Binary** (Array เรียงแล้ว) | O(1) | O(log n) | O(log n) | O(1) *(แบบ Iterative)* |
| **Insertion** (มีที่ว่าง) | O(1) | O(n) | O(n) | O(1) |
| **Deletion** | O(1) | O(n) | O(n) | O(1) |

#### อธิบายที่มาของแต่ละกรณี

| Operation | Best Case คือเมื่อ... | Average Case | Worst Case คือเมื่อ... |
|---|---|---|---|
| Access | ทุกกรณีเหมือนกัน (คำนวณ Address ตรง ๆ) | เหมือนเดิม | เหมือนเดิม |
| Linear Search | พบค่าที่ตำแหน่งแรก (1 การเปรียบเทียบ) | ต้องเทียบเฉลี่ย ≈ (n+1)/2 ครั้ง → O(n) | พบที่ตัวสุดท้ายหรือไม่พบเลย (n ครั้ง) |
| Binary Search | พบที่ตำแหน่งกึ่งกลางทันที | ⌊log₂ n⌋ ครั้ง โดยประมาณ | ⌊log₂ n⌋ + 1 ครั้ง |
| Insertion | แทรกที่ **ท้าย** (ไม่ต้องเลื่อน) | เลื่อนเฉลี่ย ≈ n/2 ตัว | แทรกที่ **ต้น** (เลื่อนทั้ง n ตัว) |
| Deletion | ลบตัว **สุดท้าย** (ไม่ต้องเลื่อน) | เลื่อนเฉลี่ย ≈ n/2 ตัว | ลบตัว **แรก** (เลื่อน n − 1 ตัว) |

**หมายเหตุสำคัญ**

1. **Binary Search ใช้ได้เฉพาะ Array ที่เรียงแล้ว** ถ้าต้อง Sort ก่อนเพื่อค้นหาครั้งเดียว ต้นทุนรวมเป็น O(n log n) ซึ่งแพงกว่า Linear Search O(n) ดังนั้น Binary Search คุ้มเมื่อค้นหาหลายครั้ง
2. **Insertion ที่ Array เต็ม:** Array ขยายไม่ได้ ต้องสร้าง Array ใหม่แล้วคัดลอก ทำให้เป็น **O(n) ทุกกรณี** อย่างไรก็ตามถ้าขยายเป็น 2 เท่าทุกครั้ง (แบบที่ `ArrayList` ทำ) ต้นทุนเฉลี่ยของการเพิ่มท้ายจะเป็น **O(1) แบบ Amortized**
3. **Update ค่าตาม Index** (`arr[i] = x`) เป็น O(1) เช่นเดียวกับ Access
4. **Traversal (วนอ่านทุกตัว)** เป็น O(n) เสมอ
5. **Sorting** ด้วย `Arrays.sort()` โดยทั่วไปเป็น O(n log n)

#### Space Complexity

| กรณี | Space |
|---|:---:|
| ตัว Array ที่เก็บข้อมูล n ตัว | O(n) |
| In-place Algorithm (เช่น Reverse, Two Pointers, Swap) | O(1) เพิ่มเติม |
| คัดลอก Array (`copyOf`, `clone`) | O(n) เพิ่มเติม |
| Two Sum ด้วย `HashMap` (แลกเวลากับพื้นที่) | O(n) เพิ่มเติม |
| Binary Search แบบ Iterative / Recursive | O(1) / O(log n) (Call Stack) |

---

## 4. Code Examples & Exercises

> **วิธีรันตัวอย่างทั้งหมด:** บันทึกแต่ละส่วนเป็นไฟล์ตามชื่อ `public class` แล้วรันด้วย `javac Xxx.java && java Xxx` (หรือ Java 11+ รันตรงได้ด้วย `java Xxx.java`)

### 4.1 ตัวอย่างการใช้งานจริง

#### ตัวอย่างที่ 1: ระบบวิเคราะห์คะแนนสอบ (`ScoreAnalyzer`)

รวมการใช้งานที่พบบ่อย: การวนลูป, การคำนวณสถิติ, Counting Array, Sort / Binary Search และการคัดลอก Array

```java
import java.util.Arrays;

public class ScoreAnalyzer {

    public static void main(String[] args) {
        // 1) สร้าง Array พร้อมกำหนดค่าเริ่มต้น (Array Initializer)
        int[] scores = {72, 85, 90, 65, 88, 95, 55, 78};
        System.out.println("คะแนนทั้งหมด : " + Arrays.toString(scores));
        System.out.println("จำนวนนักเรียน : " + scores.length);

        // 2) หาผลรวมและค่าเฉลี่ย ด้วย Enhanced for (อ่านค่าอย่างเดียว)
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        // cast เป็น double ก่อนหาร มิฉะนั้นจะได้ผลหารจำนวนเต็ม (ตัดทศนิยมทิ้ง)
        double average = (double) sum / scores.length;
        System.out.printf("ผลรวม = %d, ค่าเฉลี่ย = %.2f%n", sum, average);

        // 3) Counting Array: นับจำนวนนักเรียนในแต่ละเกรด
        //    ใช้ Index ของ Array เป็น "ตัวแทนของเกรด" -> 0=A, 1=B, 2=C, 3=D, 4=F
        String[] gradeNames = {"A", "B", "C", "D", "F"};
        int[] gradeCount = new int[gradeNames.length];   // ค่าเริ่มต้นเป็น 0 ทุกช่อง

        for (int s : scores) {
            if (s >= 80)      gradeCount[0]++;
            else if (s >= 70) gradeCount[1]++;
            else if (s >= 60) gradeCount[2]++;
            else if (s >= 50) gradeCount[3]++;
            else              gradeCount[4]++;
        }
        for (int i = 0; i < gradeNames.length; i++) {
            System.out.println("เกรด " + gradeNames[i] + " : " + gradeCount[i] + " คน");
        }

        // 4) คัดลอก Array ก่อน Sort เพื่อไม่ให้ลำดับของ Array ต้นฉบับเปลี่ยน
        int[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);                              // เรียงน้อย -> มาก
        System.out.println("เรียงแล้ว    : " + Arrays.toString(sorted));

        // 5) ค้นหาด้วย Binary Search (ใช้ได้เพราะ sorted เรียงแล้ว)
        int target = 88;
        int idx = Arrays.binarySearch(sorted, target);
        if (idx >= 0) {
            System.out.println("พบคะแนน " + target + " ที่ Index " + idx + " (ใน Array ที่เรียงแล้ว)");
        } else {
            System.out.println("ไม่พบคะแนน " + target);
        }

        // 6) Top 3: ดึง 3 ตัวสุดท้ายของ Array ที่เรียงแล้ว แล้ววนจากมากไปน้อย
        System.out.print("Top 3        : ");
        for (int i = sorted.length - 1; i >= sorted.length - 3; i--) {
            System.out.print(sorted[i] + (i > sorted.length - 3 ? ", " : "\n"));
        }
    }
}
```

**ผลลัพธ์ที่ได้**

```
คะแนนทั้งหมด : [72, 85, 90, 65, 88, 95, 55, 78]
จำนวนนักเรียน : 8
ผลรวม = 628, ค่าเฉลี่ย = 78.50
เกรด A : 4 คน
เกรด B : 2 คน
เกรด C : 1 คน
เกรด D : 1 คน
เกรด F : 0 คน
เรียงแล้ว    : [55, 65, 72, 78, 85, 88, 90, 95]
พบคะแนน 88 ที่ Index 5 (ใน Array ที่เรียงแล้ว)
Top 3        : 95, 90, 88
```

#### ตัวอย่างที่ 2: จำลอง Dynamic Array ด้วยตัวเอง (`SimpleIntList`)

แสดงกลไกเบื้องหลังของ `ArrayList` คือแยก **capacity** (ขนาดของ Array จริง) ออกจาก **size** (จำนวนที่ใช้งานอยู่) และ Insert / Delete ต้องเลื่อนสมาชิก

```java
import java.util.Arrays;

public class SimpleIntList {

    private int[] data;   // Array ที่เก็บข้อมูลจริง (capacity = data.length)
    private int size;     // จำนวนสมาชิกที่ "ใช้งานอยู่จริง" (size <= capacity)

    public SimpleIntList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("capacity must be > 0");
        }
        data = new int[initialCapacity];
        size = 0;
    }

    /** เพิ่มท้ายรายการ: O(1) แบบ Amortized (แต่ O(n) ในรอบที่ต้องขยาย Array) */
    public void add(int value) {
        ensureCapacity();
        data[size++] = value;          // ใส่ค่าที่ช่อง size แล้วค่อยเพิ่ม size
    }

    /** แทรกค่าที่ตำแหน่ง index: ต้องเลื่อนสมาชิก index..size-1 ไปขวา 1 ช่อง -> O(n) */
    public void insert(int index, int value) {
        if (index < 0 || index > size) {                // index == size คือการเพิ่มท้าย (ถูกต้อง)
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
        ensureCapacity();
        // System.arraycopy รองรับกรณีช่วงซ้อนทับกัน จึงใช้เลื่อนในตัว Array เดียวกันได้
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = value;
        size++;
    }

    /** ลบสมาชิกที่ตำแหน่ง index แล้วคืนค่าที่ถูกลบ: ต้องเลื่อนสมาชิกที่อยู่หลังมาทางซ้าย -> O(n) */
    public int removeAt(int index) {
        checkIndex(index);
        int removed = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        // int เป็น Primitive จึงไม่ต้องเคลียร์ช่องท้าย (ถ้าเป็น Object Array ควรเซ็ต data[size] = null)
        return removed;
    }

    public int get(int index) {
        checkIndex(index);
        return data[index];
    }

    public int size() {
        return size;
    }

    /** ขยาย capacity เป็น 2 เท่าเมื่อเต็ม: สร้าง Array ใหม่ + คัดลอก O(n) */
    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
            System.out.println("  [resize] capacity -> " + data.length);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }

    @Override
    public String toString() {
        // แสดงเฉพาะส่วนที่ใช้งานจริง (ตัดช่องว่างที่เหลือทิ้ง)
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    public static void main(String[] args) {
        SimpleIntList list = new SimpleIntList(2);
        list.add(10);
        list.add(20);
        list.add(30);                                        // เต็ม -> ขยายเป็น 4
        System.out.println(list);

        list.insert(1, 15);                                  // แทรกกลาง
        System.out.println("insert(1, 15) -> " + list);

        list.insert(0, 5);                                   // แทรกหัว (Worst Case) -> ขยายเป็น 8
        System.out.println("insert(0, 5)  -> " + list);

        int removed = list.removeAt(2);                      // ลบตำแหน่ง 2
        System.out.println("removeAt(2)   -> " + list + " (ลบ " + removed + ")");
        System.out.println("size = " + list.size());
    }
}
```

**ผลลัพธ์ที่ได้**

```
  [resize] capacity -> 4
[10, 20, 30]
insert(1, 15) -> [10, 15, 20, 30]
  [resize] capacity -> 8
insert(0, 5)  -> [5, 10, 15, 20, 30]
removeAt(2)   -> [5, 10, 20, 30] (ลบ 15)
size = 4
```

---

### 4.2 โจทย์ฝึกฝน 3 ระดับ

แต่ละข้อประกอบด้วย โจทย์ → แนวคิด (Algorithm) → ตาราง Trace → เฉลย Code → Complexity แนะนำให้ลองเขียนเองก่อนดูเฉลย

| ระดับ | หัวข้อ | เทคนิคหลัก | Time | Space |
|:---:|---|---|:---:|:---:|
| 🟢 Easy | หา Max / Min / Average | Single Pass Traversal | O(n) | O(1) |
| 🟡 Medium | กลับลำดับใน Array (In-place Reversal) | Swap + Two Pointers (หัว-ท้าย) | O(n) | O(1) |
| 🔴 Hard | Target Sum และ Remove Duplicates | Two Pointers (Opposite Ends / Slow-Fast) | O(n) | O(1) |

---

#### 🟢 Easy: หาค่าสูงสุด ต่ำสุด และค่าเฉลี่ยใน Array

**โจทย์:** เขียน Method รับ `int[]` แล้วหา **ค่าสูงสุด (max)**, **ค่าต่ำสุด (min)** และ **ค่าเฉลี่ย (average)** โดยห้ามใช้ `Arrays.sort()` (ให้เขียน Algorithm เอง)

**ตัวอย่าง**

```
Input : {34, -7, 52, 18, 90, -21, 45}
Output: max = 90, min = -21, average = 30.14
```

##### แนวคิด (Algorithm)

1. เช็กกรณีพิเศษก่อน: ถ้า Array เป็น `null` หรือว่าง (`length == 0`) ให้หยุด เพราะไม่มีค่าให้คำนวณ (และ `arr[0]` จะเกิด Exception)
2. กำหนดให้ `min` และ `max` เท่ากับ `arr[0]` ไม่ควรตั้งเป็น `0` หรือ `Integer.MAX_VALUE` แบบสุ่มสี่สุ่มห้า เพราะถ้าข้อมูลเป็นลบทั้งหมดหรือใหญ่มาก ค่าเริ่มต้นจะผิดพลาดได้
3. วนลูปตั้งแต่ Index `1` ถึง `length - 1` โดยเปรียบเทียบและอัปเดต `min` / `max` พร้อมสะสม `sum`
4. `average = (double) sum / length` ต้อง cast เป็น `double` ก่อนหาร
5. ใช้ `long` เก็บ `sum` เพื่อป้องกัน Integer Overflow กรณีบวกค่าจำนวนมาก

**ตารางไล่ค่า (Trace)** สำหรับ `{34, -7, 52, 18, 90, -21, 45}`

| Index `i` | `arr[i]` | min | max | sum |
|:---:|:---:|:---:|:---:|:---:|
| เริ่มต้น | 34 | 34 | 34 | 34 |
| 1 | -7 | **-7** | 34 | 27 |
| 2 | 52 | -7 | **52** | 79 |
| 3 | 18 | -7 | 52 | 97 |
| 4 | 90 | -7 | **90** | 187 |
| 5 | -21 | **-21** | 90 | 166 |
| 6 | 45 | -21 | 90 | 211 |

`average = 211 / 7 ≈ 30.14`

##### เฉลย (Code)

```java
import java.util.Arrays;

public class Easy_MinMaxAverage {

    static void analyze(int[] arr) {
        // 1) ตรวจกรณีพิเศษ: null หรือ Array ว่าง
        if (arr == null || arr.length == 0) {
            System.out.println("Array ว่าง: ไม่สามารถคำนวณได้");
            return;
        }

        // 2) กำหนดค่าเริ่มต้นจากสมาชิกตัวแรก
        int min = arr[0];
        int max = arr[0];
        long sum = arr[0];               // ใช้ long กัน Overflow

        // 3) วนตั้งแต่ตัวที่สอง (Index 1) เพราะตัวแรกใช้เป็นค่าเริ่มต้นไปแล้ว
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        // 4) cast ก่อนหาร เพื่อให้ได้ผลลัพธ์เป็นทศนิยม
        double average = (double) sum / arr.length;

        System.out.println("Array   : " + Arrays.toString(arr));
        System.out.printf("max = %d, min = %d, average = %.2f%n", max, min, average);
    }

    public static void main(String[] args) {
        analyze(new int[]{34, -7, 52, 18, 90, -21, 45});   // กรณีทั่วไป
        analyze(new int[]{5});                              // มีสมาชิกตัวเดียว
        analyze(new int[]{-3, -8, -1});                     // ค่าติดลบทั้งหมด
        analyze(new int[]{});                               // Array ว่าง
    }
}
```

**ผลลัพธ์ที่ได้**

```
Array   : [34, -7, 52, 18, 90, -21, 45]
max = 90, min = -21, average = 30.14
Array   : [5]
max = 5, min = 5, average = 5.00
Array   : [-3, -8, -1]
max = -1, min = -8, average = -4.00
Array ว่าง: ไม่สามารถคำนวณได้
```

**Complexity:** Time **O(n)** (วน 1 รอบ, เปรียบเทียบ ≈ 2(n−1) ครั้ง) | Space **O(1)**

**วิธีสั้นด้วย Stream API** (Java 8+): ได้ครบทุกค่าในรอบเดียวด้วย `IntSummaryStatistics`

```java
IntSummaryStatistics stats = Arrays.stream(arr).summaryStatistics();
System.out.println(stats.getMax() + " " + stats.getMin() + " " + stats.getAverage());
// ต้อง import java.util.IntSummaryStatistics;
// ข้อควรระวัง: ถ้า Array ว่าง getMax() จะคืน Integer.MIN_VALUE และ getMin() จะคืน Integer.MAX_VALUE
```

---

#### 🟡 Medium: กลับลำดับข้อมูลใน Array แบบ In-place (In-place Reversal)

**โจทย์:** เขียน Method กลับลำดับสมาชิกใน Array **โดยไม่สร้าง Array ใหม่** (ใช้ Space เพิ่มเติมได้เพียง O(1))

**ตัวอย่าง**

```
Input : {1, 2, 3, 4, 5}         →  Output: {5, 4, 3, 2, 1}
Input : "Hello Java" (char[])   →  Output: "avaJ olleH"
```

##### แนวคิด (Algorithm): Two Pointers จากหัวและท้าย

1. ตั้ง `left = 0` ชี้ตัวแรก และ `right = length - 1` ชี้ตัวสุดท้าย
2. **สลับ (Swap)** ค่าที่ `left` กับ `right` โดยใช้ตัวแปรชั่วคราว `temp`
3. ขยับเข้าหากลาง: `left++`, `right--`
4. ทำซ้ำตราบใดที่ `left < right` (เมื่อ `left >= right` แปลว่าพบกันที่กลางแล้ว)

```
{1, 2, 3, 4, 5}
 L           R      swap(1,5) → {5, 2, 3, 4, 1}
    L     R         swap(2,4) → {5, 4, 3, 2, 1}
       LR           left == right → หยุด (ตัวกลางอยู่ที่เดิม)
```

**ข้อสังเกต**

- จำนวนรอบ Swap = `⌊n / 2⌋` เท่านั้น ถ้าวนครบ `n` รอบจะสลับกลับไปเป็นเหมือนเดิม
- ถ้า `n` เป็นเลขคี่ ตัวกลางไม่ต้องขยับ
- เงื่อนไข `left < right` ครอบคลุมทั้ง Array ว่าง (`right = -1`) และมีตัวเดียวโดยอัตโนมัติ
- **อย่าใช้เทคนิค Swap ด้วย XOR หรือการบวก-ลบ** โดยไม่เช็กว่า `left != right` เพราะถ้าชี้ตำแหน่งเดียวกันค่าจะกลายเป็น 0 (ใช้ `temp` ปลอดภัยที่สุด)

##### เฉลย (Code)

```java
import java.util.Arrays;

public class Medium_ReverseInPlace {

    /** กลับลำดับทั้ง Array แบบ In-place */
    static void reverse(int[] arr) {
        reverseRange(arr, 0, arr.length - 1);
    }

    /** กลับลำดับเฉพาะช่วง [left, right] (รวมทั้งสองฝั่ง) แบบ In-place */
    static void reverseRange(int[] arr, int left, int right) {
        while (left < right) {
            // Swap ด้วยตัวแปรชั่วคราว
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;      // ขยับซ้ายเข้ากลาง
            right--;     // ขยับขวาเข้ากลาง
        }
    }

    /** กลับลำดับ char[] (ใช้กับการกลับคำ/ข้อความ) */
    static void reverse(char[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // กรณีความยาวคี่
        int[] a = {1, 2, 3, 4, 5};
        reverse(a);
        System.out.println(Arrays.toString(a));           // [5, 4, 3, 2, 1]

        // กรณีความยาวคู่
        int[] b = {10, 20, 30, 40};
        reverse(b);
        System.out.println(Arrays.toString(b));           // [40, 30, 20, 10]

        // กรณีขอบ: ตัวเดียว และ Array ว่าง (ไม่เกิด Error)
        int[] c = {7};
        int[] d = {};
        reverse(c);
        reverse(d);
        System.out.println(Arrays.toString(c) + " " + Arrays.toString(d));   // [7] []

        // กลับข้อความ: String เป็น Immutable จึงแปลงเป็น char[] ก่อน
        char[] text = "Hello Java".toCharArray();
        reverse(text);
        System.out.println(new String(text));             // avaJ olleH

        // ต่อยอด: หมุน Array ไปทางขวา k ตำแหน่ง ด้วยการ Reverse 3 ครั้ง
        int[] r = {1, 2, 3, 4, 5, 6, 7};
        rotateRight(r, 3);
        System.out.println(Arrays.toString(r));           // [5, 6, 7, 1, 2, 3, 4]
    }

    /** หมุนขวา k ตำแหน่ง: reverse ทั้งหมด → reverse k ตัวแรก → reverse ส่วนที่เหลือ */
    static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n;                          // ป้องกัน k >= n
        reverseRange(arr, 0, n - 1);        // [7,6,5,4,3,2,1]
        reverseRange(arr, 0, k - 1);        // [5,6,7,4,3,2,1]
        reverseRange(arr, k, n - 1);        // [5,6,7,1,2,3,4]
    }
}
```

**ผลลัพธ์ที่ได้**

```
[5, 4, 3, 2, 1]
[40, 30, 20, 10]
[7] []
avaJ olleH
[5, 6, 7, 1, 2, 3, 4]
```

**Complexity:** Time **O(n)** (Swap ⌊n/2⌋ ครั้ง) | Space **O(1)** (ใช้เพียง `left`, `right`, `temp`)

**เปรียบเทียบ:** วิธีสร้าง Array ใหม่แล้วคัดลอกกลับ (`result[n-1-i] = arr[i]`) ก็ถูกต้อง แต่ใช้ Space O(n) ซึ่งข้อกำหนดของโจทย์ต้องการ In-place

---

#### 🔴 Hard: Two Pointers Technique

Two Pointers คือเทคนิคใช้ตัวชี้ (Index) 2 ตัวเคลื่อนที่บน Array เพื่อลดงานจาก O(n²) เหลือ O(n) มี 2 รูปแบบหลัก

| รูปแบบ | การเคลื่อนที่ | ตัวอย่างปัญหา |
|---|---|---|
| **Opposite Ends** (หัว-ท้าย) | เริ่มที่ปลายทั้งสองข้าง เคลื่อนเข้าหากัน | Target Sum, Reverse, Palindrome |
| **Slow / Fast** (ตามกัน) | ตัวเร็วสำรวจ ตัวช้ารักษาตำแหน่งเขียนผลลัพธ์ | Remove Duplicates, Remove Element |

##### ส่วน A: Target Sum ใน Sorted Array

**โจทย์:** กำหนด `int[] nums` ที่ **เรียงจากน้อยไปมากแล้ว** และค่า `target` จงหา Index ของสมาชิก 2 ตัวที่บวกกันได้เท่ากับ `target` (สมมติว่ามีคำตอบอย่างมาก 1 ชุด และห้ามใช้สมาชิกตัวเดียวซ้ำ)

**ตัวอย่าง**

```
Input : nums = {1, 3, 4, 6, 8, 11, 15}, target = 14
Output: [1, 5]     (เพราะ nums[1] + nums[5] = 3 + 11 = 14)
```

**แนวคิด (Algorithm)**

1. ให้ `left = 0` (ค่าน้อยที่สุด) และ `right = n - 1` (ค่ามากที่สุด)
2. คำนวณ `sum = nums[left] + nums[right]`
3. เปรียบเทียบ `sum` กับ `target`:
   - ถ้า `sum == target` → พบคำตอบ
   - ถ้า `sum < target` → ผลรวมน้อยไป ต้องการค่าที่มากขึ้น จึง `left++`
   - ถ้า `sum > target` → ผลรวมมากไป ต้องการค่าที่น้อยลง จึง `right--`
4. ทำซ้ำตราบใดที่ `left < right` ถ้าออกจากลูปโดยไม่พบ แปลว่าไม่มีคำตอบ

**ทำไมถึงถูกต้อง (Correctness)?** เพราะ Array เรียงแล้ว ถ้า `sum > target` แสดงว่า `nums[right]` ใหญ่เกินไปเมื่อจับคู่กับ `nums[left]` ซึ่งเป็น *ค่าน้อยที่สุดที่ยังเหลือ* ดังนั้น `nums[right]` จะจับคู่กับตัวใดที่เหลืออยู่ก็ไม่มีทางได้ `target` จึงตัด `right` ทิ้งได้อย่างปลอดภัย (กรณี `sum < target` ก็พิสูจน์ในทำนองเดียวกันกับ `left`) ทุกรอบตัดผู้สมัครทิ้งได้ 1 ตัว จึงใช้ไม่เกิน n รอบ

**ตาราง Trace** (`target = 14`)

| รอบ | `left` | `right` | `nums[left]` | `nums[right]` | `sum` | การตัดสินใจ |
|:---:|:---:|:---:|:---:|:---:|:---:|---|
| 1 | 0 | 6 | 1 | 15 | 16 | 16 > 14 → `right--` |
| 2 | 0 | 5 | 1 | 11 | 12 | 12 < 14 → `left++` |
| 3 | 1 | 5 | 3 | 11 | 14 | **พบคำตอบ [1, 5]** |

##### ส่วน B: Remove Duplicates จาก Sorted Array (In-place)

**โจทย์:** กำหนด `int[] nums` ที่ **เรียงแล้ว** ให้ลบค่าซ้ำ **ในที่เดิม (In-place)** ให้แต่ละค่าเหลือตัวเดียว รักษาลำดับ และคืน **จำนวนสมาชิกที่ไม่ซ้ำ** `k` โดยให้ `k` ตัวแรกของ Array เป็นค่าที่ไม่ซ้ำ (ค่าหลังตำแหน่ง `k` ไม่สำคัญ)

**ตัวอย่าง**

```
Input : {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
Output: k = 5, และ nums ช่วงแรก = {0, 1, 2, 3, 4}
```

**แนวคิด (Algorithm): Slow / Fast Pointers**

1. `slow` = ตำแหน่ง **ล่าสุดที่เขียนค่าไม่ซ้ำแล้ว** (เริ่มที่ 0 เพราะตัวแรกไม่ซ้ำแน่นอน)
2. `fast` = ตัวสำรวจ เริ่มที่ 1 และวนไปจนสุด Array
3. ถ้า `nums[fast] != nums[slow]` แปลว่าเจอค่าใหม่ → `slow++` แล้วเขียน `nums[slow] = nums[fast]`
4. เมื่อจบ จำนวนสมาชิกไม่ซ้ำคือ `slow + 1`

เหตุที่ใช้ได้เพราะ Array เรียงแล้ว ค่าซ้ำจึงอยู่ติดกันเสมอ เพียงเทียบกับค่าที่เขียนล่าสุดก็รู้ว่าซ้ำหรือไม่

**ตาราง Trace** (`{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}`)

| `fast` | `nums[fast]` | `nums[slow]` | ซ้ำหรือไม่ | การกระทำ | `slow` | Array (ส่วนที่ใช้งาน) |
|:---:|:---:|:---:|:---:|---|:---:|---|
| 1 | 0 | 0 | ซ้ำ | ข้าม | 0 | `0` |
| 2 | 1 | 0 | ใหม่ | `slow=1`, เขียน 1 | 1 | `0,1` |
| 3 | 1 | 1 | ซ้ำ | ข้าม | 1 | `0,1` |
| 4 | 1 | 1 | ซ้ำ | ข้าม | 1 | `0,1` |
| 5 | 2 | 1 | ใหม่ | `slow=2`, เขียน 2 | 2 | `0,1,2` |
| 6 | 2 | 2 | ซ้ำ | ข้าม | 2 | `0,1,2` |
| 7 | 3 | 2 | ใหม่ | `slow=3`, เขียน 3 | 3 | `0,1,2,3` |
| 8 | 3 | 3 | ซ้ำ | ข้าม | 3 | `0,1,2,3` |
| 9 | 4 | 3 | ใหม่ | `slow=4`, เขียน 4 | 4 | `0,1,2,3,4` |

จบลูป → คืน `slow + 1 = 5`

##### เฉลย (Code)

```java
import java.util.Arrays;

public class Hard_TwoPointers {

    // ---------- ส่วน A: Target Sum ใน Sorted Array (Opposite Ends) ----------
    /** คืน Index [i, j] ที่ nums[i] + nums[j] == target หรือคืน [-1, -1] ถ้าไม่พบ */
    static int[] twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {                         // left == right คือตัวเดียวกัน ห้ามใช้ซ้ำ
            long sum = (long) nums[left] + nums[right]; // ใช้ long กัน Overflow เมื่อค่าใหญ่มาก

            if (sum == target) {
                return new int[]{left, right};         // พบคำตอบ
            } else if (sum < target) {
                left++;                                // ต้องการผลรวมที่มากขึ้น
            } else {
                right--;                               // ต้องการผลรวมที่น้อยลง
            }
        }
        return new int[]{-1, -1};                      // ไม่พบ
    }

    // ---------- ส่วน B: Remove Duplicates จาก Sorted Array (Slow/Fast) ----------
    /** ลบค่าซ้ำแบบ In-place แล้วคืนจำนวนสมาชิกที่ไม่ซ้ำ */
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 0;                                  // ตำแหน่งล่าสุดของค่าที่ไม่ซ้ำ
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {            // เจอค่าใหม่
                slow++;
                nums[slow] = nums[fast];               // เขียนทับไปที่ตำแหน่งถัดไปของ slow
            }
        }
        return slow + 1;                               // จำนวน = ตำแหน่งสุดท้าย + 1
    }

    public static void main(String[] args) {
        // ทดสอบส่วน A
        int[] sortedNums = {1, 3, 4, 6, 8, 11, 15};
        System.out.println(Arrays.toString(twoSumSorted(sortedNums, 14)));   // [1, 5]
        System.out.println(Arrays.toString(twoSumSorted(sortedNums, 100)));  // [-1, -1]
        System.out.println(Arrays.toString(twoSumSorted(new int[]{2, 7}, 9))); // [0, 1]

        // ทดสอบส่วน B
        int[] dup = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(dup);
        System.out.println("k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOf(dup, k)));          // [0, 1, 2, 3, 4]

        int[] allSame = {5, 5, 5};
        int k2 = removeDuplicates(allSame);
        System.out.println("k = " + k2 + " -> " + Arrays.toString(Arrays.copyOf(allSame, k2)));
    }
}
```

**ผลลัพธ์ที่ได้**

```
[1, 5]
[-1, -1]
[0, 1]
k = 5
[0, 1, 2, 3, 4]
k = 1 -> [5]
```

**เปรียบเทียบแนวทางของ Target Sum**

| แนวทาง | Time | Space | ข้อจำกัด |
|---|:---:|:---:|---|
| Brute Force (2 ลูปซ้อน) | O(n²) | O(1) | ช้ามากเมื่อ n ใหญ่ |
| `HashMap` (เก็บค่าที่เคยเห็น) | O(n) | O(n) | ใช้ได้กับ Array ที่ **ไม่เรียง** ด้วย |
| **Two Pointers** | **O(n)** | **O(1)** | ต้อง **เรียงลำดับก่อน** |

**Complexity ของเฉลย:** ส่วน A: Time O(n), Space O(1) | ส่วน B: Time O(n), Space O(1)

**จุดที่มักพลาด**

- ลืมเช็กเงื่อนไข `left < right` ทำให้ใช้สมาชิกตัวเดียวกันซ้ำ
- ใช้ Two Pointers กับ Array ที่ **ไม่ได้เรียงลำดับ** ตรรกะการตัดผู้สมัครจะใช้ไม่ได้ (ต้อง Sort ก่อน หรือใช้ `HashMap`)
- Remove Duplicates: เริ่ม `fast` ที่ 0 แทน 1 หรือคืนค่า `slow` แทน `slow + 1` (Off-by-one)
- ลืมว่า Array ขนาดไม่เปลี่ยน: ค่าที่อยู่หลังตำแหน่ง `k` ยังเป็นข้อมูลเก่า ต้องใช้ `k` เป็นตัวกำหนดขอบเขตข้อมูลที่ใช้ได้

---

## 5. Summary & Cheat Sheet

### สรุปประเด็นสำคัญ

- Array = ข้อมูลชนิดเดียวกัน ขนาดคงที่ เก็บเรียงติดกันใน Memory เข้าถึงด้วย Index ที่เริ่มจาก `0`
- Access O(1) ด้วยสูตร `Base + (i × Element Size)` แต่ Insert / Delete ตรงกลางต้องเลื่อนสมาชิก O(n)
- ใน Java Array เป็น Object บน Heap, `length` เป็นฟิลด์ (ไม่มีวงเล็บ) และสมาชิกมีค่า Default อัตโนมัติ
- Java เป็น Pass-by-Value เสมอ: การส่ง Array เข้า Method คือการคัดลอก Reference จึงแก้สมาชิกได้แต่เปลี่ยนตัวแปรของผู้เรียกไม่ได้
- `arr2 = arr1` ไม่ใช่การคัดลอก ให้ใช้ `clone()`, `Arrays.copyOf()` หรือ `System.arraycopy()`
- ใช้ `Arrays.toString()` แสดงผล, `Arrays.equals()` เทียบเนื้อหา และ `Arrays.sort()` ก่อน `Arrays.binarySearch()` เสมอ

### Cheat Sheet: Syntax ที่ใช้บ่อย

```java
int[] a = new int[5];                          // สร้าง (ค่า Default 0)
int[] b = {1, 2, 3};                           // สร้างพร้อมค่า
int len = b.length;                            // ความยาว (ไม่มี ())
int last = b[b.length - 1];                    // ตัวสุดท้าย

for (int i = 0; i < b.length; i++) { }         // for (ใช้ Index / แก้ค่าได้)
for (int v : b) { }                            // for-each (อ่านอย่างเดียว)
Arrays.stream(b).sum();                        // Stream

Arrays.sort(b);                                // เรียง
Arrays.binarySearch(b, 2);                     // ค้นหา (ต้องเรียงก่อน)
Arrays.copyOf(b, 10);                          // คัดลอก / เปลี่ยนขนาด
Arrays.copyOfRange(b, 1, 3);                   // คัดลอกบางช่วง
Arrays.fill(a, 0);                             // เติมค่า
Arrays.equals(a, b);                           // เทียบเนื้อหา
Arrays.toString(b);                            // แสดงผล
System.arraycopy(src, 0, dst, 0, len);         // คัดลอกเร็ว / เลื่อนสมาชิก
```

### ข้อผิดพลาดที่พบบ่อย (Common Mistakes)

| ข้อผิดพลาด | ผลที่เกิดขึ้น | วิธีแก้ |
|---|---|---|
| `i <= arr.length` ในเงื่อนไข Loop | `ArrayIndexOutOfBoundsException` | ใช้ `i < arr.length` |
| ใช้ `arr.length()` หรือ `str.length` | Compile Error | Array ใช้ `.length` / String ใช้ `.length()` |
| `System.out.println(arr)` | พิมพ์ได้ `[I@6d06d69c` | ใช้ `Arrays.toString(arr)` |
| `arr1 == arr2` เพื่อเทียบเนื้อหา | เทียบ Reference เสมอ | ใช้ `Arrays.equals(arr1, arr2)` |
| `int[] copy = arr;` | ทั้งสองตัวแปรชี้ Array เดียวกัน | ใช้ `arr.clone()` / `Arrays.copyOf()` |
| `binarySearch` กับ Array ที่ไม่เรียง | ผลลัพธ์ผิด (Undefined) | `Arrays.sort()` ก่อน |
| `new String[3]` แล้วเรียก `arr[0].length()` | `NullPointerException` | กำหนดค่าให้ครบก่อนใช้ |
| Enhanced `for` เพื่อแก้ค่า Primitive | ค่าใน Array ไม่เปลี่ยน | ใช้ `for` แบบมี Index |
| `Arrays.asList(intArray)` | ได้ `List<int[]>` (1 สมาชิก) | ใช้ `Integer[]` หรือ `Arrays.stream(...).boxed()` |

### เส้นทางการเรียนรู้ต่อยอด

1. **2D Array** (`int[][]`) และ Array of Arrays แบบ Jagged
2. **`ArrayList` / Collections Framework** และเมื่อไรควรเลือกใช้แทน Array
3. **Sorting Algorithms:** Bubble, Selection, Insertion, Merge, Quick Sort
4. **Searching:** Binary Search และรูปแบบต่อยอด (Lower/Upper Bound)
5. **เทคนิค Array ขั้นสูง:** Prefix Sum, Sliding Window, Kadane's Algorithm, Counting Sort

### โจทย์ฝึกเพิ่มเติม (ไม่มีเฉลย)

| ระดับ | โจทย์ | เทคนิคที่แนะนำ |
|---|---|---|
| Easy | หาค่าที่มากเป็นอันดับ 2 ใน Array (ไม่ใช้ Sort) | Single Pass, ตัวแปร 2 ตัว |
| Easy | ตรวจสอบว่า Array เป็น Palindrome หรือไม่ | Two Pointers |
| Medium | ย้ายเลข 0 ทั้งหมดไปท้าย Array โดยรักษาลำดับของตัวที่ไม่ใช่ 0 | Slow / Fast Pointers |
| Medium | หาผลรวมของ Subarray ที่ยาว k และมีค่ามากที่สุด | Sliding Window |
| Hard | จัดเรียง Array ที่มีเฉพาะ 0, 1, 2 ในรอบเดียว (Dutch National Flag) | Three Pointers |
| Hard | หา Subarray ที่ผลรวมมากที่สุด | Kadane's Algorithm |