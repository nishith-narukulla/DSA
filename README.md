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