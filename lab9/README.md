**Java Lamda Design Pattern** 
---
****Without lambda (original implementation of Strategy pattern)****
- This is a straight forward implementation of the strategy pattern. With one interface SortingStrategy that has a method sort which is implemented by three different classes BubbleSort, MergeSort and QuickSort. Their is also a class DataSet which has multiple responsibilities, one is initializing and maintaining data, and second is maintaining the sorting strategy and sorting data based on strategy. The main class is basic which initializes data, and sets strategy one by one and calls sort method using the data class.

****With lambda (functional programming)****
- Here there are no separate classes that implements SortingStrategy interface, instead there is a list with three anonymous functions which are the implementations for different sorting strategies. And DataSet class is now has single responsibility of only maintaining and refreshing the data and is not aware of the sorting strategies. 

****Comparison****
- Lambda functions helped in code refactoring and remove the boilerplate code. This has also helped in implementing single responsibility of the classes and now there is a clear segregation of two different business logics, one is maintaining the data and second is sorting the data. Thus, implementation now appears less verbose.
