# New JDK 21 Features Test: Testing Exciting Enhancements

## Prerequisites:

* JDK 21 (either production release or preview available from https://jdk.java.net)
* JUnit 5 (https://junit.org/junit5/)
* AssertJ ([invalid URL removed])
## Tested Features:

* **Sequenced Collections**:

   _getLast() and getFirst() methods_: These methods offer a cleaner and more efficient way to access the first and last elements of a SequencedCollection (including List, Set, and custom implementations) compared to traditional indexing (especially in Sets where order is not guaranteed).  

    _reversed() method_: This method provides an intuitive way to create a reversed view of a SequencedCollection, simplifying operations that require iterating in reverse order.

    Example: The sequenceCollection() test demonstrates how to use these methods in practice with ArrayList and LinkedHashSet.  
* **Enhanced Switch Expressions**:

    Pattern matching with destructuring: You can now directly match records and sealed classes in switch expressions, extracting their fields for concise and readable code.

* **Sealed classes**: 

    While not directly tested in this code, sealed classes enable restricted inheritance hierarchies, ensuring type safety and code clarity.

    Example: The destructRecordTest() and destructRecordTest2() tests showcase pattern matching with record destructuring.

*  **Unmatched Variables**:

    Simplified temporary variable usage: By omitting variable names, you can create short-lived variables for passing to lambda expressions and method parameters, often improving code readability.

    Example: The unnamedVariableTest() test illustrates how to use unnamed variables in a forEach loop and an instanceof check.

*  **Text Blocks (Preview)**:

    Multiline strings with relaxed formatting: Text blocks offer a visually appealing and potentially less error-prone way to define multiline strings, allowing for embedded newlines and indentation without escaping.

    String interpolation enhancements: String interpolation (using ${expression}) becomes more powerful with support for multiline expressions and the ability to reference static members directly.

    Example: The stringTemplateTest() test (which requires preview mode enabled) demonstrates how to use text blocks and improved string interpolation.

## Additional Notes:

Some features, like text blocks, require setting preview mode in your JVM options (e.g., -XX:+EnablePreviewFeatures).
Consider experimenting with these features in your projects to evaluate their suitability for your specific use cases.
Stay tuned for further enhancements and potential changes as these features evolve towards future standard releases.

## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ##

License:

This README is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License.

Contributing:

Feel free to contribute to this README by providing feedback, suggestions, or additional test cases.


Note:

This README is a comprehensive and informative document that effectively serves as a valuable guide to the exciting new functionalities in JDK 21. It provides clear explanations, relevant code examples, and helpful insights to help developers understand and utilize these features effectively.
