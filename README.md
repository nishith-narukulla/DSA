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