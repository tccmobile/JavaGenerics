# Java Generics

This program demonstrates several key concepts of Java generics:

1. **Generic Classes**:
   - `Box<T>`: Simple generic class with one type parameter
   - `Pair<K,V>`: Generic class with multiple type parameters

2. **Bounded Type Parameters**:
   - `NumberBox<T extends Number>`: Shows how to restrict type parameters to certain types
   - `<T extends Comparable<T>>`: Used in the `findMax()` method to ensure elements can be compared

3. **Generic Methods**:
   - `printArray()`: Generic method that can print arrays of any type
   - `findMax()`: Generic method with bounded type parameter

4. **Type Safety**:
   - The program demonstrates compile-time type safety
   - No explicit type casting is needed when retrieving values

When you run this program, it will demonstrate:
- Creating and using generic objects
- Working with different types in generic classes
- Using bounded type parameters
- Generic method implementation and usage
- Type safety features

The output will show various operations with strings, integers, and arrays, demonstrating how the same generic code can work with different types while maintaining type safety.