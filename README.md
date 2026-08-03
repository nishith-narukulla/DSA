# Basics

## I/O
- https://tinyl.co/4m4f
```java
Scanner sc = new Scanner(System.in);

// String
String name = sc.nextLine();
int age = sc.nextInt();
double gpa = sc.nextDouble();
```

## Datatypes
- https://tinyl.co/4m4l
### Primitive
- byte - 8 bit
- short - 2 byte
- int - 4 byte
- long - 8 byte
- float - 4 byte
- double - 8 byte
- char - 2 byte
- boolean - 1 bit

```java
byte a = 10;
short b = 20;
int c = 30;
long d = 40L;
float e = 50.0f;
double f = 60.0d;
char g = 'A';
boolean h = true;
```

### Non-primitive
- String
- Arrays
- Classes
- Interfaces

```java
String str = "Hello, World!";
System.out.println("String value: " + str);
int arr[] = { 1, 2, 3, 4, 5 };
System.out.print("Array values: ");
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

### Differences
| Feature | Primitive | Non-primitive |
| ------- | --------- | ------------- |
| Definition | pre defined in java | created by user |
| Storage | stores the actual value | stores a reference to the object |
| Null value | Can not be null | Can be null |
| Size | depends on the data type | same address size for all the types |
| Methods | cannot call methods on them | can be used to call methods to perform operations |

## Branching
### If Elseif
```java
if (n == 1) {
    System.out.println("ON");
} else if (n == 0) {
    System.out.println("OFF");
} else {
    System.out.println("Undefined");
}
```

### Switch
- https://tinyl.co/4m4p
```java
int day = 3;
String dayString = switch(day){
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid day";
};
System.out.println(dayString);
```

## Strings
- https://tinyl.co/4m4s

- Non-primitive
- Immutable
- String constant pool

### Methods
| Method | Use |
| ------ | --- |
| length(str) | character count |
| equals(str1, str2) | string equality |
| equalsIgnoreCase(str1, str2) | string equality ignoring case |
| charAt(index) | returns character at specific index |
| toCharArray() | converts string to new character array |
| contentEquals(CharSequence/StringBuffer n) | compares string to specified object |
| matches(String regex) | Tells whether or not this string matches the given regular expression |
| contains(CharSequence ch) | returns true if contains |
| startsWith(prefix) | returns true |
| endsWith(suffix) | returns true |
| indexOf(ch/str) | returns index of first occurence |
| lastIndexOf(ch/str) | returns index of last occurence |
| concat(str2) | concatenates specified string at the end |
| replace(old char/str, new char/str) | replaces part of the string with specified part|
| substring(begin, end) | returns a substring |
| toLowerCase(str) | returns lowercase version |
| toUpperCase(str) | returns uppercase version |
| trim(str) | trims whitespaces around |
| isEmpty() | returns true/false |
| isBlank() | reeturns true/false |
| lines() | returns a stream of lines |
| hashcode(str) | returns hashcode of the string |

```java
String str1 = "Nishith";
String str2 = "Nishith";
String str3 = new String("Nishith");
System.out.println(str1 == str2);
System.out.println(str1 == str3);

System.out.println(str1.length());
System.out.println(str1.equals(str2));
System.out.println(str1.charAt(0));
System.out.println(str1.indexOf('i'));
System.out.println(str1.startsWith("Ni"));
System.out.println(str1.endsWith("th"));
System.out.println(str1.toUpperCase());
System.out.println(str1.toLowerCase());
System.out.println(str1.substring(1, str1.length()));
System.out.println(str1.replace('i', 'a'));
System.out.println(str1.contains("Nish"));
System.out.println(str1.isEmpty());
System.out.println(str1.isBlank());
System.out.println(str1.hashCode());
System.out.println(str1.concat(" Narukulla"));
System.out.println(str1.matches(".*it*."));
```

## Arrays
- https://tinyl.co/4mIz

- Fixed size
- homogeneous
- stores in contiguous memory locations

### Methods
| Method | Use |
| ------ | --- |
| arr.length | returns length of an array |
| Arrays.toString(array) | converts array into string |
| Arrays.asList(array) | wraps the array into fixed list |
| Arrays.sort(array) | sorts an array in ascending order |
| Arrays.sort(array, fromIndex, toIndex) | sort subset of array |
| Arrays.binarySearch(array, key) | searches for a specific value (array must be sorted first) |
| Arrays.copyOfRange(array, from, to) | copy subset of array into new array |
| Arrays.equals(array1, array2) | array comparision |
| Arrays.mismatch(array1, array2) | Finds and returns the index of the first element where the two arrays differ. It returns -1 if they are completely identical |

```java
int arr[] = { 5, 4, 3, 2, 1 };
String arr2[] = { "Hello", "World" };
int arr3[] = { 1, 2, 3, 4, 6 };

System.out.println("Array size: " + arr.length);
System.out.println("Array size: " + arr2.length);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(arr2));
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.binarySearch(arr, 3));
System.out.println(Arrays.equals(arr, arr3)); // false
System.out.println(Arrays.mismatch(arr, arr3)); // 4
```