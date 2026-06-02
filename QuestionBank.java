package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionBank {

    // =========================
    // PYTHON → EASY → LEVEL 1
    // =========================
    public static List<Question> getPythonEasyLevel1Questions() {

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "What is the correct file extension for Python files?",
                Arrays.asList(".py", ".java", ".txt", ".exe"),
                0
        ));

        questions.add(new Question(
                "Which keyword is used to define a function in Python?",
                Arrays.asList("func", "def", "function", "define"),
                1
        ));

        questions.add(new Question(
                "What will print(type(5)) output?",
                Arrays.asList("int", "<class 'int'>", "number", "integer"),
                1
        ));

        questions.add(new Question(
                "Which symbol is used for comments in Python?",
                Arrays.asList("//", "#", "/* */", "--"),
                1
        ));

        questions.add(new Question(
                "Which data type is immutable in Python?",
                Arrays.asList("List", "Dictionary", "Set", "Tuple"),
                3
        ));

        return questions;
    }
 // =========================
 // PYTHON → EASY → LEVEL 2
 // =========================
 public static List<Question> getPythonEasyLevel2Questions() {

     List<Question> questions = new ArrayList<>();

     questions.add(new Question(
             "Which function is used to display output in Python?",
             Arrays.asList("echo()", "print()", "display()", "output()"),
             1
     ));

     questions.add(new Question(
             "What is the output of: print(2 + 3 * 4)?",
             Arrays.asList("20", "14", "24", "10"),
             1
     ));

     questions.add(new Question(
             "Which keyword is used for conditional statements?",
             Arrays.asList("if", "when", "condition", "check"),
             0
     ));

     questions.add(new Question(
             "Which of these is a valid variable name?",
             Arrays.asList("1value", "value-1", "_value", "value 1"),
             2
     ));

     questions.add(new Question(
             "What does len() function do?",
             Arrays.asList(
                     "Counts lines",
                     "Counts characters",
                     "Returns length",
                     "Returns type"
             ),
             2
     ));

     return questions;
 }
//=========================
//PYTHON → EASY → LEVEL 3
//=========================
public static List<Question> getPythonEasyLevel3Questions() {

  List<Question> questions = new ArrayList<>();

  questions.add(new Question(
      "Which function is used to take user input in Python?",
      Arrays.asList("scan()", "input()", "get()", "read()"),
      1
  ));

  questions.add(new Question(
      "What is the output of: print(5 > 3)?",
      Arrays.asList("True", "False", "5", "3"),
      0
  ));

  questions.add(new Question(
      "Which operator is used for exponentiation?",
      Arrays.asList("^", "*", "**", "//"),
      2
  ));

  questions.add(new Question(
      "Which keyword is used to create a loop in Python?",
      Arrays.asList("repeat", "loop", "for", "iterate"),
      2
  ));

  questions.add(new Question(
      "What is the output of: print(len('Python'))?",
      Arrays.asList("5", "6", "7", "Error"),
      1
  ));

  return questions;
}
//=========================
//PYTHON → EASY → LEVEL 4
//=========================
public static List<Question> getPythonEasyLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which of the following is a valid Python list?",
     Arrays.asList("[1, 2, 3]", "{1, 2, 3}", "(1, 2, 3)", "<1, 2, 3>"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(10 % 3)?",
     Arrays.asList("3", "1", "0", "Error"),
     1
 ));

 questions.add(new Question(
     "Which function is used to convert a number into a string?",
     Arrays.asList("int()", "str()", "float()", "bool()"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to exit a loop?",
     Arrays.asList("stop", "exit", "break", "end"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(3 * 'Hi')?",
     Arrays.asList("HiHiHi", "3Hi", "Error", "Hi 3 times"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → EASY → LEVEL 5
//=========================
public static List<Question> getPythonEasyLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which of the following is used to define a dictionary?",
     Arrays.asList("[]", "()", "{}", "<>"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(4 == 4)?",
     Arrays.asList("True", "False", "4", "Error"),
     0
 ));

 questions.add(new Question(
     "Which function is used to find the maximum value?",
     Arrays.asList("top()", "max()", "high()", "largest()"),
     1
 ));

 questions.add(new Question(
     "Which symbol is used for floor division?",
     Arrays.asList("/", "%", "//", "**"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(type('Hello'))?",
     Arrays.asList("<class 'str'>", "<class 'string'>", "string", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → EASY → LEVEL 6
//=========================
public static List<Question> getPythonEasyLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which function is used to find the minimum value?",
     Arrays.asList("min()", "low()", "smallest()", "least()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(2 + 2 == 4)?",
     Arrays.asList("True", "False", "4", "Error"),
     0
 ));

 questions.add(new Question(
     "Which of the following is a Boolean value in Python?",
     Arrays.asList("true", "TRUE", "True", "yes"),
     2
 ));

 questions.add(new Question(
     "Which function is used to get the absolute value?",
     Arrays.asList("abs()", "absolute()", "fabs()", "mod()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(5 != 3)?",
     Arrays.asList("True", "False", "5", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → EASY → LEVEL 7
//=========================
public static List<Question> getPythonEasyLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which function is used to round a number?",
     Arrays.asList("round()", "approx()", "ceil()", "floor()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(9 // 2)?",
     Arrays.asList("4.5", "4", "5", "Error"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to define a class in Python?",
     Arrays.asList("class", "define", "object", "struct"),
     0
 ));

 questions.add(new Question(
     "Which method is used to remove all items from a list?",
     Arrays.asList("delete()", "clear()", "remove()", "empty()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(bool(0))?",
     Arrays.asList("True", "False", "0", "Error"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → EASY → LEVEL 8
//=========================
public static List<Question> getPythonEasyLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which function returns the number of items in a list?",
     Arrays.asList("count()", "size()", "len()", "length()"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print('Hello' + 'World')?",
     Arrays.asList("Hello World", "HelloWorld", "Error", "Hello+World"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used for an alternative condition?",
     Arrays.asList("else", "elseif", "otherwise", "elif"),
     0
 ));

 questions.add(new Question(
     "Which method adds an element at the end of a list?",
     Arrays.asList("add()", "append()", "insert()", "push()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(10 > 20)?",
     Arrays.asList("True", "False", "10", "Error"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → EASY → LEVEL 9
//=========================
public static List<Question> getPythonEasyLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which function is used to convert a value to float?",
     Arrays.asList("float()", "double()", "int()", "str()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(3 < 5 and 2 < 4)?",
     Arrays.asList("True", "False", "Error", "None"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to continue to the next loop iteration?",
     Arrays.asList("next", "continue", "skip", "pass"),
     1
 ));

 questions.add(new Question(
     "Which data type is used to store multiple values in square brackets?",
     Arrays.asList("Tuple", "Dictionary", "Set", "List"),
     3
 ));

 questions.add(new Question(
     "What is the output of: print('Python'[0])?",
     Arrays.asList("P", "y", "Python", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → EASY → LEVEL 10
//=========================
public static List<Question> getPythonEasyLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which function is used to convert a value to integer?",
     Arrays.asList("int()", "str()", "float()", "bool()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(7 >= 7)?",
     Arrays.asList("True", "False", "7", "Error"),
     0
 ));

 questions.add(new Question(
     "Which of the following is a tuple?",
     Arrays.asList("[1, 2, 3]", "{1, 2, 3}", "(1, 2, 3)", "<1, 2, 3>"),
     2
 ));

 questions.add(new Question(
     "Which keyword is used to define a block of code?",
     Arrays.asList("{}", "begin-end", "Indentation", "start-end"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(len([10, 20, 30]))?",
     Arrays.asList("2", "3", "30", "Error"),
     1
 ));

 return questions;
}

//=========================
//PYTHON → MEDIUM → LEVEL 1
//=========================
public static List<Question> getPythonMediumLevel1Questions() {

  List<Question> questions = new ArrayList<>();

  questions.add(new Question(
      "What is the output of: print(type([]))?",
      Arrays.asList("<class 'list'>", "<class 'tuple'>", "<class 'dict'>", "<class 'set'>"),
      0
  ));

  questions.add(new Question(
      "Which keyword is used to handle exceptions in Python?",
      Arrays.asList("catch", "error", "try", "handle"),
      2
  ));

  questions.add(new Question(
      "What does the len() function return?",
      Arrays.asList("Type", "Length", "Index", "Size in bytes"),
      1
  ));

  questions.add(new Question(
      "Which loop is used when number of iterations is unknown?",
      Arrays.asList("for", "do-while", "while", "repeat"),
      2
  ));

  questions.add(new Question(
      "Which data structure uses key-value pairs?",
      Arrays.asList("List", "Tuple", "Set", "Dictionary"),
      3
  ));

  return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 2
//=========================
public static List<Question> getPythonMediumLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(10 // 3)?",
     Arrays.asList("3.33", "3", "4", "Error"),
     1
 ));

 questions.add(new Question(
     "Which function converts a string to integer?",
     Arrays.asList("int()", "str()", "float()", "bool()"),
     0
 ));

 questions.add(new Question(
     "Which keyword creates a generator?",
     Arrays.asList("yield", "return", "gen", "lambda"),
     0
 ));

 questions.add(new Question(
     "What is the correct way to open a file?",
     Arrays.asList(
         "open(file)",
         "open('file.txt', 'r')",
         "file.open()",
         "read(file)"
     ),
     1
 ));

 questions.add(new Question(
     "Which module is used for math operations?",
     Arrays.asList("sys", "os", "math", "random"),
     2
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 3
//=========================
public static List<Question> getPythonMediumLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print([1,2,3] * 2)?",
     Arrays.asList("[1,2,3,1,2,3]", "[2,4,6]", "Error", "[1,2,3]*2"),
     0
 ));

 questions.add(new Question(
     "Which method is used to remove a specific element from a list?",
     Arrays.asList("delete()", "pop()", "remove()", "discard()"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(type({}))?",
     Arrays.asList("<class 'dict'>", "<class 'set'>", "<class 'list'>", "Error"),
     0
 ));

 questions.add(new Question(
     "Which statement is used to handle multiple exceptions?",
     Arrays.asList("multi except", "except (E1, E2)", "catch all", "handle multiple"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(bool([]))?",
     Arrays.asList("True", "False", "None", "Error"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 4
//=========================
public static List<Question> getPythonMediumLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(list(range(3)))?",
     Arrays.asList("[0, 1, 2]", "[1, 2, 3]", "[0, 1, 2, 3]", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method is used to add a key-value pair to a dictionary?",
     Arrays.asList("add()", "insert()", "dict[key] = value", "append()"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(5 in [1,2,3,4,5])?",
     Arrays.asList("True", "False", "5", "Error"),
     0
 ));

 questions.add(new Question(
     "Which function is used to get user input as integer?",
     Arrays.asList("int(input())", "input(int)", "read()", "scan()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print('abc'.upper())?",
     Arrays.asList("ABC", "abc", "Abc", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 5
//=========================
public static List<Question> getPythonMediumLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print('Python'.lower())?",
     Arrays.asList("python", "PYTHON", "Python", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method is used to find the index of an element in a list?",
     Arrays.asList("index()", "find()", "search()", "locate()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(4 in {1,2,3})?",
     Arrays.asList("True", "False", "4", "Error"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to import a module in Python?",
     Arrays.asList("include", "import", "using", "require"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(type((1,)))?",
     Arrays.asList("<class 'tuple'>", "<class 'int'>", "<class 'list'>", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 6
//=========================
public static List<Question> getPythonMediumLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(10 / 4)?",
     Arrays.asList("2.5", "2", "2.0", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method is used to sort a list?",
     Arrays.asList("sort()", "order()", "arrange()", "sortedList()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(len({'a':1, 'b':2}))?",
     Arrays.asList("1", "2", "3", "Error"),
     1
 ));

 questions.add(new Question(
     "Which statement is used to create a function that returns multiple values?",
     Arrays.asList("return a, b", "return [a b]", "return(a;b)", "return multiple"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(type(set()))?",
     Arrays.asList("<class 'set'>", "<class 'dict'>", "<class 'list'>", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 7
//=========================
public static List<Question> getPythonMediumLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(3 * [1, 2])?",
     Arrays.asList("[1, 2, 1, 2, 1, 2]", "[3, 6]", "Error", "[1,2,3]"),
     0
 ));

 questions.add(new Question(
     "Which method is used to update a dictionary?",
     Arrays.asList("add()", "update()", "append()", "extend()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print('Hello'.replace('H','J'))?",
     Arrays.asList("Jello", "Hello", "Error", "JHello"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to define an anonymous function?",
     Arrays.asList("func", "def", "lambda", "anon"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(sum([1,2,3]))?",
     Arrays.asList("6", "123", "Error", "3"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 8
//=========================
public static List<Question> getPythonMediumLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(all([True, True, False]))?",
     Arrays.asList("True", "False", "Error", "None"),
     1
 ));

 questions.add(new Question(
     "Which function is used to get the ASCII value of a character?",
     Arrays.asList("char()", "ord()", "ascii()", "value()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(any([0, False, 5]))?",
     Arrays.asList("True", "False", "0", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method is used to split a string?",
     Arrays.asList("divide()", "split()", "break()", "separate()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(list('ABC'))?",
     Arrays.asList("['A', 'B', 'C']", "ABC", "['ABC']", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 9
//=========================
public static List<Question> getPythonMediumLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(divmod(10, 3))?",
     Arrays.asList("(3, 1)", "(3.33, 1)", "(10, 3)", "Error"),
     0
 ));

 questions.add(new Question(
     "Which built-in function is used to filter elements from a list?",
     Arrays.asList("filter()", "map()", "reduce()", "select()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(isinstance(5, int))?",
     Arrays.asList("True", "False", "Error", "None"),
     0
 ));

 questions.add(new Question(
     "Which function is used to combine two lists element-wise?",
     Arrays.asList("zip()", "join()", "merge()", "combine()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(round(3.6))?",
     Arrays.asList("3", "4", "3.6", "Error"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → MEDIUM → LEVEL 10
//=========================
public static List<Question> getPythonMediumLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(pow(2, 3))?",
     Arrays.asList("6", "8", "9", "Error"),
     1
 ));

 questions.add(new Question(
     "Which function is used to return the absolute value of a number?",
     Arrays.asList("abs()", "absolute()", "fabs()", "positive()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(sorted([3,1,2]))?",
     Arrays.asList("[3,1,2]", "[1,2,3]", "Error", "(1,2,3)"),
     1
 ));

 questions.add(new Question(
     "Which statement is used to stop a loop immediately?",
     Arrays.asList("exit", "break", "stop", "return"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(min([4,7,1]))?",
     Arrays.asList("4", "7", "1", "Error"),
     2
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 1
//=========================
public static List<Question> getPythonHardLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(bool('False'))?",
     Arrays.asList("False", "True", "Error", "None"),
     1
 ));

 questions.add(new Question(
     "Which of these is a mutable data type?",
     Arrays.asList("Tuple", "String", "List", "Integer"),
     2
 ));

 questions.add(new Question(
     "What does the 'pass' statement do?",
     Arrays.asList("Stops execution", "Skips iteration", "Does nothing", "Raises error"),
     2
 ));

 questions.add(new Question(
     "Which method is used to add an element to a list?",
     Arrays.asList("add()", "append()", "insert()", "push()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(2 ** 3)?",
     Arrays.asList("6", "8", "9", "5"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 2
//=========================
public static List<Question> getPythonHardLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(type(lambda x: x))?",
     Arrays.asList("<class 'function'>", "<class 'lambda'>", "<class 'object'>", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method removes and returns the last element of a list?",
     Arrays.asList("remove()", "delete()", "pop()", "discard()"),
     2
 ));

 questions.add(new Question(
     "What is the correct way to define a class in Python?",
     Arrays.asList("class MyClass:", "define MyClass:", "new class MyClass:", "create MyClass:"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to create an anonymous function?",
     Arrays.asList("func", "lambda", "anon", "def"),
     1
 ));

 questions.add(new Question(
     "Which built-in function returns the largest value?",
     Arrays.asList("max()", "largest()", "big()", "high()"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 3
//=========================
public static List<Question> getPythonHardLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print([i*i for i in range(3)])?",
     Arrays.asList("[0, 1, 4]", "[1, 4, 9]", "[0, 1, 2]", "Error"),
     0
 ));

 questions.add(new Question(
     "Which decorator is used to define a static method?",
     Arrays.asList("@classmethod", "@staticmethod", "@abstract", "@decorator"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(type({1,2,3}))?",
     Arrays.asList("<class 'set'>", "<class 'dict'>", "<class 'list'>", "Error"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to create a context manager?",
     Arrays.asList("with", "using", "open", "context"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print((lambda x: x*2)(5))?",
     Arrays.asList("5", "10", "25", "Error"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 4
//=========================
public static List<Question> getPythonHardLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(list(map(lambda x: x+1, [1,2,3])))?",
     Arrays.asList("[2, 3, 4]", "[1, 2, 3]", "[1, 4, 9]", "Error"),
     0
 ));

 questions.add(new Question(
     "Which function is used to reduce a list to a single value?",
     Arrays.asList("map()", "filter()", "reduce()", "sum()"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print({x: x*x for x in range(3)})?",
     Arrays.asList("{0:0, 1:1, 2:4}", "{1:1, 2:4, 3:9}", "[0,1,4]", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method is called when an object is created?",
     Arrays.asList("__start__", "__init__", "__create__", "__newObject__"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(type(None))?",
     Arrays.asList("<class 'None'>", "<class 'NoneType'>", "<class 'null'>", "Error"),
     1
 ));

 return questions;
}
// =========================
//PYTHON → HARD → LEVEL 5
//=========================
public static List<Question> getPythonHardLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print([i for i in range(5) if i % 2 == 0])?",
     Arrays.asList("[0, 2, 4]", "[1, 3, 5]", "[2, 4]", "Error"),
     0
 ));

 questions.add(new Question(
     "Which module is used for regular expressions in Python?",
     Arrays.asList("regex", "re", "pyregex", "pattern"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(' '.join(['A','B','C']))?",
     Arrays.asList("ABC", "A B C", "A,B,C", "Error"),
     1
 ));

 questions.add(new Question(
     "Which special method is used to represent an object as a string?",
     Arrays.asList("__str__", "__repr__", "__print__", "__display__"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(max([5, 2, 9, 1]))?",
     Arrays.asList("5", "9", "1", "Error"),
     1
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 6
//=========================
public static List<Question> getPythonHardLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(list(filter(lambda x: x>2, [1,2,3,4])))?",
     Arrays.asList("[3, 4]", "[1, 2]", "[2, 3, 4]", "Error"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to define a generator function?",
     Arrays.asList("yield", "return", "generate", "lambda"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print({1,2,3} & {2,3,4})?",
     Arrays.asList("{2, 3}", "{1, 4}", "{1,2,3,4}", "Error"),
     0
 ));

 questions.add(new Question(
     "Which built-in function is used to get the length of an object?",
     Arrays.asList("size()", "length()", "len()", "count()"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print(type((x for x in range(3))))?",
     Arrays.asList("<class 'generator'>", "<class 'list'>", "<class 'tuple'>", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 7
//=========================
public static List<Question> getPythonHardLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print((1,2,3) + (4,5))?",
     Arrays.asList("(1,2,3,4,5)", "[1,2,3,4,5]", "Error", "(5,7,8)"),
     0
 ));

 questions.add(new Question(
     "Which method is used to read all lines from a file?",
     Arrays.asList("read()", "readlines()", "readall()", "getline()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(5 == 5.0)?",
     Arrays.asList("True", "False", "Error", "None"),
     0
 ));

 questions.add(new Question(
     "Which operator is used for identity comparison?",
     Arrays.asList("==", "=", "is", "equals"),
     2
 ));

 questions.add(new Question(
     "What is the output of: print({1,2,3}.issubset({1,2,3,4}))?",
     Arrays.asList("True", "False", "Error", "None"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 8
//=========================
public static List<Question> getPythonHardLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print(list(enumerate(['a','b'])))?",
     Arrays.asList("[(0, 'a'), (1, 'b')]", "['a','b']", "(0,'a'),(1,'b')", "Error"),
     0
 ));

 questions.add(new Question(
     "Which method is used to check if a string starts with a specific prefix?",
     Arrays.asList("start()", "startswith()", "begin()", "checkStart()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(10 % 3)?",
     Arrays.asList("3", "1", "0", "Error"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to raise an exception manually?",
     Arrays.asList("throw", "raise", "error", "except"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(sorted('cab'))?",
     Arrays.asList("['a', 'b', 'c']", "cab", "abc", "Error"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 9
//=========================
public static List<Question> getPythonHardLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print({x for x in range(5) if x%2==0})?",
     Arrays.asList("{0, 2, 4}", "[0, 2, 4]", "(0, 2, 4)", "Error"),
     0
 ));

 questions.add(new Question(
     "Which function is used to serialize an object into JSON format?",
     Arrays.asList("json.dump()", "json.dumps()", "json.save()", "json.convert()"),
     1
 ));

 questions.add(new Question(
     "What is the output of: print(type([]) is list)?",
     Arrays.asList("True", "False", "Error", "None"),
     0
 ));

 questions.add(new Question(
     "Which method is used to remove whitespace from both ends of a string?",
     Arrays.asList("strip()", "trim()", "removeSpace()", "clean()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(list(reversed([1,2,3])))?",
     Arrays.asList("[3, 2, 1]", "[1, 2, 3]", "Error", "(3,2,1)"),
     0
 ));

 return questions;
}
//=========================
//PYTHON → HARD → LEVEL 10
//=========================
public static List<Question> getPythonHardLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "What is the output of: print((x**2 for x in range(3)))?",
     Arrays.asList(
         "<generator object>",
         "[0, 1, 4]",
         "(0, 1, 4)",
         "Error"
     ),
     0
 ));

 questions.add(new Question(
     "Which special method is used to overload the + operator?",
     Arrays.asList("__add__", "__plus__", "__sum__", "__concat__"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print({1,2,3}.union({3,4}))?",
     Arrays.asList("{1, 2, 3, 4}", "{3, 4}", "{1,2}", "Error"),
     0
 ));

 questions.add(new Question(
     "Which built-in function is used to get documentation of an object?",
     Arrays.asList("help()", "doc()", "info()", "describe()"),
     0
 ));

 questions.add(new Question(
     "What is the output of: print(isinstance(True, int))?",
     Arrays.asList("True", "False", "Error", "None"),
     0
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 1
//=========================
public static List<Question> getJavaEasyLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
         "Which keyword is used to define a class in Java?",
         Arrays.asList("class", "define", "struct", "object"),
         0
 ));

 questions.add(new Question(
         "Which method is the entry point of a Java program?",
         Arrays.asList("start()", "run()", "main()", "init()"),
         2
 ));

 questions.add(new Question(
         "Which of these is NOT a Java data type?",
         Arrays.asList("int", "float", "boolean", "real"),
         3
 ));

 questions.add(new Question(
         "Which symbol is used to end a statement in Java?",
         Arrays.asList(".", ":", ";", ","),
         2
 ));

 questions.add(new Question(
         "Which keyword is used to create an object?",
         Arrays.asList("new", "create", "object", "alloc"),
         0
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 2
//=========================
public static List<Question> getJavaEasyLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
         "Which keyword is used to inherit a class in Java?",
         Arrays.asList("implements", "extends", "inherits", "super"),
         1
 ));

 questions.add(new Question(
         "Which access modifier makes members visible everywhere?",
         Arrays.asList("private", "protected", "default", "public"),
         3
 ));

 questions.add(new Question(
         "Which of these is a loop in Java?",
         Arrays.asList("repeat", "foreach", "for", "loop"),
         2
 ));

 questions.add(new Question(
         "Which package is imported by default in Java?",
         Arrays.asList("java.io", "java.lang", "java.util", "java.net"),
         1
 ));

 questions.add(new Question(
         "Which keyword is used to stop inheritance?",
         Arrays.asList("static", "final", "private", "abstract"),
         1
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 3
//=========================
public static List<Question> getJavaEasyLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to define a method in Java?",
     Arrays.asList("function", "method", "void", "def"),
     2
 ));

 questions.add(new Question(
     "Which data type is used to store true/false values?",
     Arrays.asList("int", "boolean", "String", "char"),
     1
 ));

 questions.add(new Question(
     "Which operator is used for addition?",
     Arrays.asList("-", "*", "+", "/"),
     2
 ));

 questions.add(new Question(
     "Which loop checks condition before execution?",
     Arrays.asList("do-while", "for", "while", "foreach"),
     2
 ));

 questions.add(new Question(
     "Which class is used to take user input in Java?",
     Arrays.asList("Scanner", "Input", "Reader", "Console"),
     0
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 4
//=========================
public static List<Question> getJavaEasyLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to define a constant variable?",
     Arrays.asList("static", "final", "const", "fixed"),
     1
 ));

 questions.add(new Question(
     "Which method is used to print output without a new line?",
     Arrays.asList("System.out.print()", "System.out.println()", "print()", "echo()"),
     0
 ));

 questions.add(new Question(
     "Which symbol is used for single-line comments?",
     Arrays.asList("//", "/* */", "#", "--"),
     0
 ));

 questions.add(new Question(
     "Which data type is used to store decimal numbers?",
     Arrays.asList("int", "boolean", "double", "char"),
     2
 ));

 questions.add(new Question(
     "Which keyword is used to return a value from a method?",
     Arrays.asList("break", "return", "exit", "yield"),
     1
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 5
//=========================
public static List<Question> getJavaEasyLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to handle exceptions?",
     Arrays.asList("catch", "try", "handle", "error"),
     1
 ));

 questions.add(new Question(
     "Which block is always executed in exception handling?",
     Arrays.asList("try", "catch", "final", "finally"),
     3
 ));

 questions.add(new Question(
     "Which operator is used to compare values?",
     Arrays.asList("=", "==", "!=", "equals"),
     1
 ));

 questions.add(new Question(
     "Which data type is used to store a single character?",
     Arrays.asList("String", "char", "character", "text"),
     1
 ));

 questions.add(new Question(
     "Which method converts a String to integer?",
     Arrays.asList("Integer.parseInt()", "toInt()", "parse()", "convert()"),
     0
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 6
//=========================
public static List<Question> getJavaEasyLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which loop executes at least once?",
     Arrays.asList("for", "while", "do-while", "foreach"),
     2
 ));

 questions.add(new Question(
     "Which keyword is used to inherit a class?",
     Arrays.asList("implements", "extends", "inherits", "super"),
     1
 ));

 questions.add(new Question(
     "Which keyword refers to current object?",
     Arrays.asList("self", "this", "current", "super"),
     1
 ));

 questions.add(new Question(
     "Which collection allows duplicate elements?",
     Arrays.asList("Set", "Map", "List", "HashSet"),
     2
 ));

 questions.add(new Question(
     "Which package contains Scanner class?",
     Arrays.asList("java.io", "java.lang", "java.util", "java.net"),
     2
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 7
//=========================
public static List<Question> getJavaEasyLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to create an interface?",
     Arrays.asList("class", "interface", "implements", "abstract"),
     1
 ));

 questions.add(new Question(
     "Which method is used to start a thread?",
     Arrays.asList("run()", "execute()", "start()", "init()"),
     2
 ));

 questions.add(new Question(
     "Which operator is used for logical OR?",
     Arrays.asList("&&", "||", "|", "&"),
     1
 ));

 questions.add(new Question(
     "Which method is used to find the length of a String?",
     Arrays.asList("size()", "length()", "count()", "getLength()"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to define a subclass?",
     Arrays.asList("implements", "extends", "inherits", "instanceof"),
     1
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 8
//=========================
public static List<Question> getJavaEasyLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to implement an interface?",
     Arrays.asList("extends", "implements", "interface", "inherits"),
     1
 ));

 questions.add(new Question(
     "Which exception occurs when accessing a null object?",
     Arrays.asList("IOException", "NullPointerException", "ArithmeticException", "RuntimeException"),
     1
 ));

 questions.add(new Question(
     "Which method is used to compare two strings properly?",
     Arrays.asList("==", "equals()", "compare()", "match()"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to prevent method overriding?",
     Arrays.asList("static", "final", "private", "abstract"),
     1
 ));

 questions.add(new Question(
     "Which data type is used to store large whole numbers?",
     Arrays.asList("int", "float", "double", "long"),
     3
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 9
//=========================
public static List<Question> getJavaEasyLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to create a subclass constructor call?",
     Arrays.asList("this", "super", "parent", "base"),
     1
 ));

 questions.add(new Question(
     "Which method is used to convert integer to String?",
     Arrays.asList("String.valueOf()", "toString(int)", "convert()", "parseInt()"),
     0
 ));

 questions.add(new Question(
     "Which collection stores elements in key-value pairs?",
     Arrays.asList("List", "Set", "Map", "ArrayList"),
     2
 ));

 questions.add(new Question(
     "Which operator checks object equality (reference comparison)?",
     Arrays.asList("equals()", "==", "!=", "instanceof"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to stop a loop?",
     Arrays.asList("exit", "break", "stop", "return"),
     1
 ));

 return questions;
}
//=========================
//JAVA → EASY → LEVEL 10
//=========================
public static List<Question> getJavaEasyLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to handle multiple exceptions separately?",
     Arrays.asList("multi-catch", "try-multiple", "multiple catch blocks", "throws"),
     2
 ));

 questions.add(new Question(
     "Which method is called automatically before garbage collection?",
     Arrays.asList("delete()", "destroy()", "finalize()", "clean()"),
     2
 ));

 questions.add(new Question(
     "Which access modifier makes a variable visible only within its class?",
     Arrays.asList("public", "protected", "private", "default"),
     2
 ));

 questions.add(new Question(
     "Which class is used to generate random numbers?",
     Arrays.asList("Math", "Random", "Scanner", "System"),
     1
 ));

 questions.add(new Question(
     "Which method is used to exit the program explicitly?",
     Arrays.asList("System.exit()", "break", "return", "stop()"),
     0
 ));

 return questions;
}

//=========================
//JAVA → MEDIUM → LEVEL 1
//=========================
public static List<Question> getJavaMediumLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to override a method?",
     Arrays.asList("@Override", "override", "extends", "implements"),
     0
 ));

 questions.add(new Question(
     "Which concept allows one class to acquire properties of another?",
     Arrays.asList("Encapsulation", "Abstraction", "Inheritance", "Polymorphism"),
     2
 ));

 questions.add(new Question(
     "Which method is used to compare two strings?",
     Arrays.asList("==", "equals()", "compare()", "match()"),
     1
 ));

 questions.add(new Question(
     "Which collection does not allow duplicates?",
     Arrays.asList("List", "Set", "ArrayList", "Vector"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to prevent method overriding?",
     Arrays.asList("static", "final", "private", "abstract"),
     1
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 2
//=========================
public static List<Question> getJavaMediumLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which interface provides capability to store objects in key-value pairs?",
     Arrays.asList("List", "Set", "Map", "Collection"),
     2
 ));

 questions.add(new Question(
     "Which exception occurs when dividing by zero?",
     Arrays.asList("NullPointerException", "ArithmeticException", "IOException", "RuntimeException"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to create a thread?",
     Arrays.asList("new Thread()", "start()", "run()", "thread()"),
     0
 ));

 questions.add(new Question(
     "Which access modifier restricts access within the same package?",
     Arrays.asList("public", "private", "protected", "default"),
     3
 ));

 questions.add(new Question(
     "Which class is the parent of all classes in Java?",
     Arrays.asList("Main", "Object", "System", "Class"),
     1
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 3
//=========================
public static List<Question> getJavaMediumLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which collection class allows dynamic resizing of array?",
     Arrays.asList("Array", "ArrayList", "HashSet", "TreeMap"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to throw an exception manually?",
     Arrays.asList("throws", "throw", "catch", "final"),
     1
 ));

 questions.add(new Question(
     "Which method is used to sort a List?",
     Arrays.asList("Collections.sort()", "List.sorting()", "sortList()", "Arrays.order()"),
     0
 ));

 questions.add(new Question(
     "Which concept binds data and methods together?",
     Arrays.asList("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
     1
 ));

 questions.add(new Question(
     "Which operator is used for type checking?",
     Arrays.asList("typeof", "instanceof", "is", "check"),
     1
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 4
//=========================
public static List<Question> getJavaMediumLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which method is used to read a line from Scanner?",
     Arrays.asList("next()", "nextLine()", "readLine()", "scanLine()"),
     1
 ));

 questions.add(new Question(
     "Which class is used for file handling?",
     Arrays.asList("File", "Scanner", "Reader", "Stream"),
     0
 ));

 questions.add(new Question(
     "Which interface is implemented by ArrayList?",
     Arrays.asList("Set", "Map", "List", "Queue"),
     2
 ));

 questions.add(new Question(
     "Which keyword ensures a variable cannot be changed?",
     Arrays.asList("static", "constant", "final", "fixed"),
     2
 ));

 questions.add(new Question(
     "Which method is used to convert String to lowercase?",
     Arrays.asList("toLower()", "lowercase()", "toLowerCase()", "convertLower()"),
     2
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 5
//=========================
public static List<Question> getJavaMediumLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which collection does NOT allow duplicate elements?",
     Arrays.asList("ArrayList", "HashSet", "Vector", "LinkedList"),
     1
 ));

 questions.add(new Question(
     "Which method is used to check if a key exists in a Map?",
     Arrays.asList("contains()", "hasKey()", "containsKey()", "checkKey()"),
     2
 ));

 questions.add(new Question(
     "Which keyword is used to call parent class constructor?",
     Arrays.asList("this()", "parent()", "super()", "base()"),
     2
 ));

 questions.add(new Question(
     "Which class is used to format date and time (modern Java)?",
     Arrays.asList("Date", "Calendar", "LocalDate", "SimpleDate"),
     2
 ));

 questions.add(new Question(
     "Which method removes an element from ArrayList by index?",
     Arrays.asList("delete()", "remove()", "pop()", "discard()"),
     1
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 6
//=========================
public static List<Question> getJavaMediumLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which interface is used to represent a functional interface?",
     Arrays.asList("@Function", "@FunctionalInterface", "@Lambda", "@Interface"),
     1
 ));

 questions.add(new Question(
     "Which method is used to compare two objects for sorting?",
     Arrays.asList("compare()", "compareTo()", "equals()", "sort()"),
     1
 ));

 questions.add(new Question(
     "Which stream method is used to filter elements?",
     Arrays.asList("map()", "filter()", "reduce()", "collect()"),
     1
 ));

 questions.add(new Question(
     "Which class is used for thread synchronization?",
     Arrays.asList("ThreadSafe", "Lock", "Sync", "Executor"),
     1
 ));

 questions.add(new Question(
     "Which method is used to convert List to array?",
     Arrays.asList("toArray()", "convertArray()", "asArray()", "listToArray()"),
     0
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 7
//=========================
public static List<Question> getJavaMediumLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which class is used to create immutable objects?",
     Arrays.asList("String", "StringBuilder", "StringBuffer", "Scanner"),
     0
 ));

 questions.add(new Question(
     "Which method is used to execute a Runnable thread?",
     Arrays.asList("run()", "start()", "execute()", "launch()"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to define a lambda expression?",
     Arrays.asList("->", "=>", "lambda", "::"),
     0
 ));

 questions.add(new Question(
     "Which method is used to collect Stream elements into a List?",
     Arrays.asList("collect(Collectors.toList())", "toList()", "streamList()", "gather()"),
     0
 ));

 questions.add(new Question(
     "Which exception occurs when accessing invalid array index?",
     Arrays.asList("IndexOutOfBoundsException", "ArrayIndexOutOfBoundsException", "NullPointerException", "IllegalAccessException"),
     1
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 8
//=========================
public static List<Question> getJavaMediumLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which interface is implemented by HashMap?",
     Arrays.asList("List", "Set", "Map", "Queue"),
     2
 ));

 questions.add(new Question(
     "Which method is used to merge two Streams?",
     Arrays.asList("concat()", "merge()", "combine()", "join()"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to restrict inheritance to same package?",
     Arrays.asList("private", "protected", "default", "public"),
     1
 ));

 questions.add(new Question(
     "Which class is used to create thread pools?",
     Arrays.asList("ThreadPool", "ExecutorService", "RunnablePool", "ThreadManager"),
     1
 ));

 questions.add(new Question(
     "Which method is used to check if Optional contains a value?",
     Arrays.asList("isPresent()", "hasValue()", "exists()", "check()"),
     0
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 9
//=========================
public static List<Question> getJavaMediumLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which method is used to convert Stream into an array?",
     Arrays.asList("toArray()", "collectArray()", "asArray()", "streamArray()"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to prevent a class from being inherited?",
     Arrays.asList("static", "private", "final", "abstract"),
     2
 ));

 questions.add(new Question(
     "Which method is used to retrieve value from Optional safely?",
     Arrays.asList("get()", "orElse()", "value()", "fetch()"),
     1
 ));

 questions.add(new Question(
     "Which collection maintains insertion order?",
     Arrays.asList("HashSet", "TreeSet", "LinkedHashSet", "PriorityQueue"),
     2
 ));

 questions.add(new Question(
     "Which interface is used to define comparison logic externally?",
     Arrays.asList("Comparable", "Comparator", "Serializable", "Cloneable"),
     1
 ));

 return questions;
}
//=========================
//JAVA → MEDIUM → LEVEL 10
//=========================
public static List<Question> getJavaMediumLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which class is used to perform parallel stream operations?",
     Arrays.asList("Stream", "ParallelStream", "Collections", "Executor"),
     0
 ));

 questions.add(new Question(
     "Which method is used to group elements in Stream API?",
     Arrays.asList("groupBy()", "groupingBy()", "collectGroup()", "partition()"),
     1
 ));

 questions.add(new Question(
     "Which method reference operator is used in Java?",
     Arrays.asList("->", "::", "=>", "==>"),
     1
 ));

 questions.add(new Question(
     "Which class is used to represent date and time with timezone?",
     Arrays.asList("LocalDate", "LocalTime", "ZonedDateTime", "Date"),
     2
 ));

 questions.add(new Question(
     "Which method shuts down ExecutorService gracefully?",
     Arrays.asList("stop()", "close()", "shutdown()", "terminate()"),
     2
 ));

 return questions;
}

//=========================
//JAVA → HARD → LEVEL 1
//=========================
public static List<Question> getJavaHardLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which feature allows runtime method binding?",
     Arrays.asList("Encapsulation", "Abstraction", "Polymorphism", "Inheritance"),
     2
 ));

 questions.add(new Question(
     "Which keyword is used to create an abstract class?",
     Arrays.asList("interface", "abstract", "extends", "implements"),
     1
 ));

 questions.add(new Question(
     "Which collection allows duplicate elements?",
     Arrays.asList("Set", "Map", "List", "HashSet"),
     2
 ));

 questions.add(new Question(
     "Which method is called automatically when object is created?",
     Arrays.asList("main()", "constructor", "start()", "init()"),
     1
 ));

 questions.add(new Question(
     "Which operator is used for logical AND?",
     Arrays.asList("&", "&&", "|", "||"),
     1
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 2
//=========================
public static List<Question> getJavaHardLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which class handles input from keyboard?",
     Arrays.asList("Scanner", "System", "InputStream", "Reader"),
     0
 ));

 questions.add(new Question(
     "Which keyword prevents inheritance?",
     Arrays.asList("static", "final", "private", "abstract"),
     1
 ));

 questions.add(new Question(
     "Which exception must be handled at compile time?",
     Arrays.asList("RuntimeException", "ArithmeticException", "IOException", "NullPointerException"),
     2
 ));

 questions.add(new Question(
     "Which method starts a thread?",
     Arrays.asList("run()", "execute()", "start()", "init()"),
     2
 ));

 questions.add(new Question(
     "Which collection is synchronized?",
     Arrays.asList("ArrayList", "Vector", "HashMap", "HashSet"),
     1
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 3
//=========================
public static List<Question> getJavaHardLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which feature allows a class to implement multiple interfaces?",
     Arrays.asList("Inheritance", "Multiple Inheritance", "Interfaces", "Polymorphism"),
     2
 ));

 questions.add(new Question(
     "Which method is used to define natural ordering?",
     Arrays.asList("compare()", "compareTo()", "equals()", "hashCode()"),
     1
 ));

 questions.add(new Question(
     "Which collection is thread-safe by default?",
     Arrays.asList("ArrayList", "HashMap", "Vector", "LinkedList"),
     2
 ));

 questions.add(new Question(
     "Which exception is thrown when a thread is interrupted?",
     Arrays.asList("InterruptedException", "ThreadException", "RuntimeException", "IOException"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to synchronize a block of code?",
     Arrays.asList("lock", "synchronized", "sync", "threadsafe"),
     1
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 4
//=========================
public static List<Question> getJavaHardLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which method must be overridden when using Comparator?",
     Arrays.asList("compare()", "compareTo()", "equals()", "hashCode()"),
     0
 ));

 questions.add(new Question(
     "Which class is used for asynchronous task execution?",
     Arrays.asList("Future", "ExecutorService", "Thread", "Callable"),
     1
 ));

 questions.add(new Question(
     "Which memory area stores method calls?",
     Arrays.asList("Heap", "Stack", "Method Area", "Cache"),
     1
 ));

 questions.add(new Question(
     "Which annotation is used to suppress warnings?",
     Arrays.asList("@Ignore", "@SuppressWarnings", "@Override", "@Deprecated"),
     1
 ));

 questions.add(new Question(
     "Which interface supports lambda expressions?",
     Arrays.asList("Serializable", "Cloneable", "Functional Interface", "Runnable"),
     2
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 5
//=========================
public static List<Question> getJavaHardLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which class loader loads core Java classes?",
     Arrays.asList("Extension ClassLoader", "Bootstrap ClassLoader", "System ClassLoader", "App ClassLoader"),
     1
 ));

 questions.add(new Question(
     "Which method is used to define custom serialization?",
     Arrays.asList("writeObject()", "serialize()", "saveObject()", "store()"),
     0
 ));

 questions.add(new Question(
     "Which keyword is used to define generic types?",
     Arrays.asList("<T>", "<Generic>", "<Type>", "<Object>"),
     0
 ));

 questions.add(new Question(
     "Which exception occurs when casting fails?",
     Arrays.asList("TypeMismatchException", "ClassCastException", "IllegalCastException", "RuntimeException"),
     1
 ));

 questions.add(new Question(
     "Which interface represents a task returning a result?",
     Arrays.asList("Runnable", "Callable", "Future", "Executor"),
     1
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 6
//=========================
public static List<Question> getJavaHardLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which keyword is used to ensure visibility of variable changes across threads?",
     Arrays.asList("static", "volatile", "synchronized", "transient"),
     1
 ));

 questions.add(new Question(
     "Which method is used to wait for a thread to finish execution?",
     Arrays.asList("sleep()", "wait()", "join()", "stop()"),
     2
 ));

 questions.add(new Question(
     "Which type of inner class cannot access instance variables directly?",
     Arrays.asList("Member Inner Class", "Static Nested Class", "Local Inner Class", "Anonymous Class"),
     1
 ));

 questions.add(new Question(
     "Which method is used to compute hash value of an object?",
     Arrays.asList("equals()", "hash()", "hashCode()", "getHash()"),
     2
 ));

 questions.add(new Question(
     "Which keyword prevents a variable from being serialized?",
     Arrays.asList("final", "static", "volatile", "transient"),
     3
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 7
//=========================
public static List<Question> getJavaHardLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which JVM component is responsible for memory management?",
     Arrays.asList("ClassLoader", "Garbage Collector", "JIT Compiler", "Interpreter"),
     1
 ));

 questions.add(new Question(
     "Which collection provides log(n) time complexity for basic operations?",
     Arrays.asList("HashMap", "TreeMap", "ArrayList", "LinkedList"),
     1
 ));

 questions.add(new Question(
     "Which interface allows objects to be cloned?",
     Arrays.asList("Serializable", "Cloneable", "Comparable", "Iterable"),
     1
 ));

 questions.add(new Question(
     "Which exception is thrown when a resource fails to close automatically?",
     Arrays.asList("IOException", "SuppressedException", "RuntimeException", "IllegalStateException"),
     1
 ));

 questions.add(new Question(
     "Which method is used in try-with-resources to auto-close resources?",
     Arrays.asList("finalize()", "close()", "shutdown()", "destroy()"),
     1
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 8
//=========================
public static List<Question> getJavaHardLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which interface represents a sequence of elements supporting sequential and parallel operations?",
     Arrays.asList("Collection", "Iterable", "Stream", "List"),
     2
 ));

 questions.add(new Question(
     "Which method is used to create an immutable list (Java 9+)?",
     Arrays.asList("List.of()", "Collections.immutableList()", "Arrays.asImmutable()", "List.create()"),
     0
 ));

 questions.add(new Question(
     "Which class is used for high-performance concurrent hash table?",
     Arrays.asList("HashMap", "Hashtable", "ConcurrentHashMap", "TreeMap"),
     2
 ));

 questions.add(new Question(
     "Which annotation marks a method as deprecated?",
     Arrays.asList("@Old", "@Deprecated", "@Remove", "@Legacy"),
     1
 ));

 questions.add(new Question(
     "Which functional interface takes one argument and returns a result?",
     Arrays.asList("Supplier", "Consumer", "Predicate", "Function"),
     3
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 9
//=========================
public static List<Question> getJavaHardLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which method is used to dynamically load a class at runtime?",
     Arrays.asList("Class.load()", "Class.forName()", "loadClass()", "newInstance()"),
     1
 ));

 questions.add(new Question(
     "Which exception is thrown when reflection fails to find a method?",
     Arrays.asList("MethodNotFoundException", "NoSuchMethodException", "IllegalAccessException", "InvocationException"),
     1
 ));

 questions.add(new Question(
     "Which keyword is used to restrict method access to same package only?",
     Arrays.asList("private", "protected", "default", "public"),
     2
 ));

 questions.add(new Question(
     "Which memory area stores instance variables?",
     Arrays.asList("Stack", "Heap", "Method Area", "Register"),
     1
 ));

 questions.add(new Question(
     "Which interface represents a boolean-valued function?",
     Arrays.asList("Function", "Supplier", "Predicate", "Consumer"),
     2
 ));

 return questions;
}
//=========================
//JAVA → HARD → LEVEL 10
//=========================
public static List<Question> getJavaHardLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which method is used to obtain a parallel stream?",
     Arrays.asList("parallel()", "parallelStream()", "streamParallel()", "toParallel()"),
     1
 ));

 questions.add(new Question(
     "Which class is used to create non-blocking asynchronous tasks?",
     Arrays.asList("FutureTask", "CompletableFuture", "Callable", "Executor"),
     1
 ));

 questions.add(new Question(
     "Which annotation is used to indicate a functional interface?",
     Arrays.asList("@Lambda", "@FunctionalInterface", "@Override", "@Interface"),
     1
 ));

 questions.add(new Question(
     "Which garbage collection algorithm is default in modern JVMs (Java 9+)?",
     Arrays.asList("Serial GC", "Parallel GC", "G1 GC", "CMS GC"),
     2
 ));

 questions.add(new Question(
     "Which interface supports custom sorting logic in collections?",
     Arrays.asList("Comparable", "Comparator", "Iterable", "Cloneable"),
     1
 ));

 return questions;
}

// =========================
//GK → EASY → LEVEL 1
//=========================
public static List<Question> getGkEasyLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
         "What is the capital of India?",
         Arrays.asList("Mumbai", "Delhi", "Kolkata", "Chennai"),
         1
 ));

 questions.add(new Question(
         "Which planet is known as the Red Planet?",
         Arrays.asList("Earth", "Mars", "Jupiter", "Venus"),
         1
 ));

 questions.add(new Question(
         "How many days are there in a week?",
         Arrays.asList("5", "6", "7", "8"),
         2
 ));

 questions.add(new Question(
         "Which is the largest ocean?",
         Arrays.asList("Indian", "Atlantic", "Pacific", "Arctic"),
         2
 ));

 questions.add(new Question(
         "Which animal is known as the King of Jungle?",
         Arrays.asList("Tiger", "Lion", "Elephant", "Bear"),
         1
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 2
//=========================
public static List<Question> getGkEasyLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
         "Which is the national bird of India?",
         Arrays.asList("Peacock", "Eagle", "Sparrow", "Parrot"),
         0
 ));

 questions.add(new Question(
         "How many continents are there?",
         Arrays.asList("5", "6", "7", "8"),
         2
 ));

 questions.add(new Question(
         "Which gas do humans breathe in?",
         Arrays.asList("Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"),
         0
 ));

 questions.add(new Question(
         "Which festival is called the festival of lights?",
         Arrays.asList("Holi", "Diwali", "Eid", "Christmas"),
         1
 ));

 questions.add(new Question(
         "Which country has the largest population?",
         Arrays.asList("USA", "India", "China", "Russia"),
         1
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 3
//=========================
public static List<Question> getGkEasyLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the largest continent?",
     Arrays.asList("Africa", "Asia", "Europe", "North America"),
     1
 ));

 questions.add(new Question(
     "How many colors are there in a rainbow?",
     Arrays.asList("5", "6", "7", "8"),
     2
 ));

 questions.add(new Question(
     "Which is the fastest land animal?",
     Arrays.asList("Lion", "Tiger", "Cheetah", "Horse"),
     2
 ));

 questions.add(new Question(
     "Which country is famous for the Eiffel Tower?",
     Arrays.asList("Italy", "Germany", "France", "Spain"),
     2
 ));

 questions.add(new Question(
     "Which is the smallest planet in our solar system?",
     Arrays.asList("Mars", "Mercury", "Venus", "Earth"),
     1
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 4
//=========================
public static List<Question> getGkEasyLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the tallest mountain in the world?",
     Arrays.asList("K2", "Mount Everest", "Kangchenjunga", "Makalu"),
     1
 ));

 questions.add(new Question(
     "Which ocean is the deepest?",
     Arrays.asList("Indian", "Pacific", "Atlantic", "Arctic"),
     1
 ));

 questions.add(new Question(
     "Who invented the telephone?",
     Arrays.asList("Thomas Edison", "Alexander Graham Bell", "Newton", "Einstein"),
     1
 ));

 questions.add(new Question(
     "Which country is known as the Land of Kangaroos?",
     Arrays.asList("USA", "Australia", "Canada", "Brazil"),
     1
 ));

 questions.add(new Question(
     "Which gas do plants absorb from the atmosphere?",
     Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"),
     2
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 5
//=========================
public static List<Question> getGkEasyLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the longest river in India?",
     Arrays.asList("Yamuna", "Godavari", "Ganga", "Brahmaputra"),
     2
 ));

 questions.add(new Question(
     "Who was the first man to walk on the Moon?",
     Arrays.asList("Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "Michael Collins"),
     1
 ));

 questions.add(new Question(
     "Which is the national flower of India?",
     Arrays.asList("Rose", "Lotus", "Sunflower", "Lily"),
     1
 ));

 questions.add(new Question(
     "Which country gifted the Statue of Liberty to the USA?",
     Arrays.asList("France", "Germany", "Italy", "Spain"),
     0
 ));

 questions.add(new Question(
     "Which is the largest mammal in the world?",
     Arrays.asList("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"),
     1
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 6
//=========================
public static List<Question> getGkEasyLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the national animal of India?",
     Arrays.asList("Lion", "Elephant", "Tiger", "Leopard"),
     2
 ));

 questions.add(new Question(
     "How many states are there in India?",
     Arrays.asList("28", "29", "30", "27"),
     0
 ));

 questions.add(new Question(
     "Which is the largest desert in the world?",
     Arrays.asList("Sahara", "Gobi", "Thar", "Arabian"),
     0
 ));

 questions.add(new Question(
     "Which blood group is known as universal donor?",
     Arrays.asList("A", "B", "O negative", "AB positive"),
     2
 ));

 questions.add(new Question(
     "Which instrument is used to measure temperature?",
     Arrays.asList("Barometer", "Thermometer", "Hygrometer", "Altimeter"),
     1
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 7
//=========================
public static List<Question> getGkEasyLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which planet is closest to the Sun?",
     Arrays.asList("Venus", "Earth", "Mercury", "Mars"),
     2
 ));

 questions.add(new Question(
     "Which is the largest ocean in the world?",
     Arrays.asList("Indian", "Pacific", "Atlantic", "Arctic"),
     1
 ));

 questions.add(new Question(
     "Who is known as the Father of the Nation (India)?",
     Arrays.asList("Jawaharlal Nehru", "Subhash Chandra Bose", "Mahatma Gandhi", "Bhagat Singh"),
     2
 ));

 questions.add(new Question(
     "Which gas is essential for human respiration?",
     Arrays.asList("Carbon Dioxide", "Nitrogen", "Oxygen", "Helium"),
     2
 ));

 questions.add(new Question(
     "Which is the smallest continent?",
     Arrays.asList("Europe", "Australia", "Antarctica", "South America"),
     1
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 8
//=========================
public static List<Question> getGkEasyLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the currency of Japan?",
     Arrays.asList("Won", "Yen", "Dollar", "Euro"),
     1
 ));

 questions.add(new Question(
     "Which is the largest organ in the human body?",
     Arrays.asList("Heart", "Brain", "Skin", "Liver"),
     2
 ));

 questions.add(new Question(
     "Which country is famous for pyramids?",
     Arrays.asList("Mexico", "Peru", "Egypt", "Greece"),
     2
 ));

 questions.add(new Question(
     "Which festival is known as the Festival of Colors?",
     Arrays.asList("Diwali", "Holi", "Eid", "Christmas"),
     1
 ));

 questions.add(new Question(
     "Which is the longest bone in the human body?",
     Arrays.asList("Femur", "Tibia", "Humerus", "Spine"),
     0
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 9
//=========================
public static List<Question> getGkEasyLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the national currency of the USA?",
     Arrays.asList("Dollar", "Euro", "Pound", "Yen"),
     0
 ));

 questions.add(new Question(
     "Which planet is known as the Blue Planet?",
     Arrays.asList("Mars", "Earth", "Neptune", "Venus"),
     1
 ));

 questions.add(new Question(
     "Which is the capital city of Australia?",
     Arrays.asList("Sydney", "Melbourne", "Canberra", "Perth"),
     2
 ));

 questions.add(new Question(
     "Which animal is the largest land mammal?",
     Arrays.asList("Elephant", "Giraffe", "Rhino", "Hippo"),
     0
 ));

 questions.add(new Question(
     "Which vitamin is known as the sunshine vitamin?",
     Arrays.asList("Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D"),
     3
 ));

 return questions;
}
//=========================
//GK → EASY → LEVEL 10
//=========================
public static List<Question> getGkEasyLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the largest country in the world by area?",
     Arrays.asList("USA", "China", "Russia", "Canada"),
     2
 ));

 questions.add(new Question(
     "Which river flows through Egypt?",
     Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi"),
     1
 ));

 questions.add(new Question(
     "Who invented the light bulb?",
     Arrays.asList("Einstein", "Newton", "Thomas Edison", "Galileo"),
     2
 ));

 questions.add(new Question(
     "Which is the hardest natural substance?",
     Arrays.asList("Gold", "Iron", "Diamond", "Silver"),
     2
 ));

 questions.add(new Question(
     "Which continent is known as the Dark Continent?",
     Arrays.asList("Asia", "Africa", "Europe", "Australia"),
     1
 ));

 return questions;
}

//=========================
//GK → MEDIUM → LEVEL 1
//=========================
public static List<Question> getGkMediumLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Who was the first President of India?",
     Arrays.asList("Jawaharlal Nehru", "Dr. Rajendra Prasad", "Sardar Patel", "B. R. Ambedkar"),
     1
 ));

 questions.add(new Question(
     "Which country hosted the 2016 Olympics?",
     Arrays.asList("China", "Brazil", "UK", "Russia"),
     1
 ));

 questions.add(new Question(
     "What is the largest desert in the world?",
     Arrays.asList("Sahara", "Gobi", "Kalahari", "Arabian"),
     0
 ));

 questions.add(new Question(
     "Which river is the longest in the world?",
     Arrays.asList("Amazon", "Ganga", "Nile", "Yangtze"),
     2
 ));

 questions.add(new Question(
     "Which element has the chemical symbol 'Au'?",
     Arrays.asList("Silver", "Gold", "Copper", "Iron"),
     1
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 2
//=========================
public static List<Question> getGkMediumLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country is known as the Land of the Rising Sun?",
     Arrays.asList("China", "Japan", "Thailand", "South Korea"),
     1
 ));

 questions.add(new Question(
     "Who wrote the Indian National Anthem?",
     Arrays.asList("Rabindranath Tagore", "Mahatma Gandhi", "Bankim Chandra", "Sarojini Naidu"),
     0
 ));

 questions.add(new Question(
     "Which planet is the largest in the solar system?",
     Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"),
     2
 ));

 questions.add(new Question(
     "In which year did India gain independence?",
     Arrays.asList("1945", "1946", "1947", "1948"),
     2
 ));

 questions.add(new Question(
     "Which gas is most abundant in Earth's atmosphere?",
     Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"),
     1
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 3
//=========================
public static List<Question> getGkMediumLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Who discovered gravity when an apple fell on his head?",
     Arrays.asList("Albert Einstein", "Isaac Newton", "Galileo Galilei", "Nikola Tesla"),
     1
 ));

 questions.add(new Question(
     "Which country is the largest producer of coffee?",
     Arrays.asList("India", "Brazil", "Colombia", "Vietnam"),
     1
 ));

 questions.add(new Question(
     "Which Indian city is known as the Silicon Valley of India?",
     Arrays.asList("Hyderabad", "Pune", "Bangalore", "Chennai"),
     2
 ));

 questions.add(new Question(
     "Which is the longest mountain range in the world?",
     Arrays.asList("Himalayas", "Andes", "Rockies", "Alps"),
     1
 ));

 questions.add(new Question(
     "Which organ purifies blood in the human body?",
     Arrays.asList("Heart", "Liver", "Kidney", "Lungs"),
     2
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 4
//=========================
public static List<Question> getGkMediumLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country is home to the Amazon rainforest?",
     Arrays.asList("Brazil", "Peru", "Colombia", "Argentina"),
     0
 ));

 questions.add(new Question(
     "Who was the first woman to win a Nobel Prize?",
     Arrays.asList("Marie Curie", "Mother Teresa", "Indira Gandhi", "Florence Nightingale"),
     0
 ));

 questions.add(new Question(
     "Which is the smallest country in the world?",
     Arrays.asList("Monaco", "Vatican City", "Maldives", "Singapore"),
     1
 ));

 questions.add(new Question(
     "Which planet has the most moons?",
     Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"),
     3
 ));

 questions.add(new Question(
     "Which freedom fighter is known as Netaji?",
     Arrays.asList("Bhagat Singh", "Subhash Chandra Bose", "Jawaharlal Nehru", "Sardar Patel"),
     1
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 5
//=========================
public static List<Question> getGkMediumLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country hosted the 2020 Summer Olympics?",
     Arrays.asList("China", "Japan", "Brazil", "UK"),
     1
 ));

 questions.add(new Question(
     "What is the chemical formula of water?",
     Arrays.asList("H2O", "CO2", "O2", "NaCl"),
     0
 ));

 questions.add(new Question(
     "Which Mughal emperor built the Taj Mahal?",
     Arrays.asList("Akbar", "Babur", "Shah Jahan", "Aurangzeb"),
     2
 ));

 questions.add(new Question(
     "Which country is known as the Land of the Midnight Sun?",
     Arrays.asList("Norway", "Sweden", "Finland", "Iceland"),
     0
 ));

 questions.add(new Question(
     "Who wrote the play 'Romeo and Juliet'?",
     Arrays.asList("Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Mark Twain"),
     1
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 6
//=========================
public static List<Question> getGkMediumLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which is the largest island in the world?",
     Arrays.asList("Greenland", "Australia", "Borneo", "Madagascar"),
     0
 ));

 questions.add(new Question(
     "Who was the first Prime Minister of India?",
     Arrays.asList("Mahatma Gandhi", "Jawaharlal Nehru", "Sardar Patel", "Rajendra Prasad"),
     1
 ));

 questions.add(new Question(
     "Which is the deepest ocean trench?",
     Arrays.asList("Mariana Trench", "Java Trench", "Peru Trench", "Tonga Trench"),
     0
 ));

 questions.add(new Question(
     "Which metal is liquid at room temperature?",
     Arrays.asList("Gold", "Mercury", "Silver", "Copper"),
     1
 ));

 questions.add(new Question(
     "Which country is known as the Land of Thousand Lakes?",
     Arrays.asList("Canada", "Finland", "Sweden", "Norway"),
     1
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 7
//=========================
public static List<Question> getGkMediumLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Who developed the theory of evolution?",
     Arrays.asList("Gregor Mendel", "Charles Darwin", "Louis Pasteur", "Albert Einstein"),
     1
 ));

 questions.add(new Question(
     "Which is the highest civilian award in India?",
     Arrays.asList("Padma Shri", "Bharat Ratna", "Padma Bhushan", "Ashok Chakra"),
     1
 ));

 questions.add(new Question(
     "Which river is known as the Sorrow of Bengal?",
     Arrays.asList("Ganga", "Yamuna", "Damodar", "Brahmaputra"),
     2
 ));

 questions.add(new Question(
     "Which country has the Great Wall?",
     Arrays.asList("India", "Japan", "China", "Mongolia"),
     2
 ));

 questions.add(new Question(
     "Which is the smallest bone in the human body?",
     Arrays.asList("Stapes", "Femur", "Tibia", "Humerus"),
     0
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 8
//=========================
public static List<Question> getGkMediumLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which planet is known for its prominent ring system?",
     Arrays.asList("Jupiter", "Saturn", "Uranus", "Neptune"),
     1
 ));

 questions.add(new Question(
     "Who was the first Indian woman to go to space?",
     Arrays.asList("Kalpana Chawla", "Sunita Williams", "Indira Gandhi", "Kiran Bedi"),
     0
 ));

 questions.add(new Question(
     "Which is the capital of South Korea?",
     Arrays.asList("Busan", "Seoul", "Incheon", "Daegu"),
     1
 ));

 questions.add(new Question(
     "Which vitamin helps in blood clotting?",
     Arrays.asList("Vitamin A", "Vitamin C", "Vitamin D", "Vitamin K"),
     3
 ));

 questions.add(new Question(
     "Which continent has the most countries?",
     Arrays.asList("Asia", "Europe", "Africa", "South America"),
     2
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 9
//=========================
public static List<Question> getGkMediumLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country is the largest exporter of oil?",
     Arrays.asList("USA", "Saudi Arabia", "Russia", "UAE"),
     1
 ));

 questions.add(new Question(
     "Who was the first woman Prime Minister of the United Kingdom?",
     Arrays.asList("Theresa May", "Margaret Thatcher", "Angela Merkel", "Queen Elizabeth II"),
     1
 ));

 questions.add(new Question(
     "Which Indian state has the longest coastline?",
     Arrays.asList("Tamil Nadu", "Gujarat", "Maharashtra", "Kerala"),
     1
 ));

 questions.add(new Question(
     "Which element is most abundant in the Earth's crust?",
     Arrays.asList("Iron", "Oxygen", "Silicon", "Aluminium"),
     1
 ));

 questions.add(new Question(
     "Which organization maintains international peace and security?",
     Arrays.asList("WHO", "UNESCO", "United Nations", "IMF"),
     2
 ));

 return questions;
}
//=========================
//GK → MEDIUM → LEVEL 10
//=========================
public static List<Question> getGkMediumLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the highest number of time zones?",
     Arrays.asList("USA", "Russia", "France", "China"),
     2
 ));

 questions.add(new Question(
     "Who was the first person to reach the South Pole?",
     Arrays.asList("Robert Scott", "Roald Amundsen", "Ernest Shackleton", "Edmund Hillary"),
     1
 ));

 questions.add(new Question(
     "Which is the largest freshwater lake in the world by surface area?",
     Arrays.asList("Lake Superior", "Lake Victoria", "Lake Baikal", "Caspian Sea"),
     0
 ));

 questions.add(new Question(
     "Which Indian city is known as the Pink City?",
     Arrays.asList("Udaipur", "Jaipur", "Jodhpur", "Bikaner"),
     1
 ));

 questions.add(new Question(
     "Which gas is primarily responsible for global warming?",
     Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"),
     2
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 1
//=========================
public static List<Question> getGkHardLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the longest coastline in the world?",
     Arrays.asList("USA", "Russia", "Canada", "Australia"),
     2
 ));

 questions.add(new Question(
     "Who was the first woman Prime Minister of India?",
     Arrays.asList("Sarojini Naidu", "Indira Gandhi", "Pratibha Patil", "Sonia Gandhi"),
     1
 ));

 questions.add(new Question(
     "Which is the smallest continent?",
     Arrays.asList("Europe", "Australia", "Antarctica", "South America"),
     1
 ));

 questions.add(new Question(
     "Which country uses the currency 'Yen'?",
     Arrays.asList("China", "South Korea", "Japan", "Thailand"),
     2
 ));

 questions.add(new Question(
     "Which vitamin is produced when sunlight hits the skin?",
     Arrays.asList("Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"),
     3
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 2
//=========================
public static List<Question> getGkHardLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which scientist proposed the theory of relativity?",
     Arrays.asList("Isaac Newton", "Albert Einstein", "Nikola Tesla", "Galileo"),
     1
 ));

 questions.add(new Question(
     "Which country is home to the Great Barrier Reef?",
     Arrays.asList("USA", "Australia", "Brazil", "Mexico"),
     1
 ));

 questions.add(new Question(
     "What is the capital of Canada?",
     Arrays.asList("Toronto", "Ottawa", "Vancouver", "Montreal"),
     1
 ));

 questions.add(new Question(
     "Which metal has the highest electrical conductivity?",
     Arrays.asList("Gold", "Copper", "Silver", "Aluminium"),
     2
 ));

 questions.add(new Question(
     "Which organ in the human body produces insulin?",
     Arrays.asList("Liver", "Kidney", "Pancreas", "Heart"),
     2
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 3
//=========================
public static List<Question> getGkHardLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the largest exclusive economic zone (EEZ)?",
     Arrays.asList("USA", "Australia", "France", "Russia"),
     2
 ));

 questions.add(new Question(
     "Who was the first Secretary-General of the United Nations?",
     Arrays.asList("Kofi Annan", "Ban Ki-moon", "Trygve Lie", "Dag Hammarskjöld"),
     2
 ));

 questions.add(new Question(
     "Which is the oldest known civilization in the world?",
     Arrays.asList("Egyptian", "Indus Valley", "Mesopotamian", "Chinese"),
     2
 ));

 questions.add(new Question(
     "Which country shares the longest international border with India?",
     Arrays.asList("China", "Pakistan", "Bangladesh", "Nepal"),
     2
 ));

 questions.add(new Question(
     "Which element has the atomic number 1?",
     Arrays.asList("Helium", "Hydrogen", "Oxygen", "Nitrogen"),
     1
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 4
//=========================
public static List<Question> getGkHardLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which empire was ruled by Genghis Khan?",
     Arrays.asList("Roman Empire", "Ottoman Empire", "Mongol Empire", "Persian Empire"),
     2
 ));

 questions.add(new Question(
     "Which country has the most active volcanoes?",
     Arrays.asList("Japan", "Indonesia", "USA", "Italy"),
     1
 ));

 questions.add(new Question(
     "Who formulated the laws of motion?",
     Arrays.asList("Galileo", "Einstein", "Isaac Newton", "Kepler"),
     2
 ));

 questions.add(new Question(
     "Which is the deepest lake in the world?",
     Arrays.asList("Lake Superior", "Lake Victoria", "Lake Baikal", "Caspian Sea"),
     2
 ));

 questions.add(new Question(
     "Which treaty ended World War I?",
     Arrays.asList("Treaty of Paris", "Treaty of Versailles", "Treaty of Vienna", "Treaty of Berlin"),
     1
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 5
//=========================
public static List<Question> getGkHardLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which scientist developed the uncertainty principle?",
     Arrays.asList("Niels Bohr", "Werner Heisenberg", "Max Planck", "Erwin Schrödinger"),
     1
 ));

 questions.add(new Question(
     "Which country is both in Europe and Asia?",
     Arrays.asList("Turkey", "Egypt", "Greece", "Iran"),
     0
 ));

 questions.add(new Question(
     "What is the hardest known natural material?",
     Arrays.asList("Graphene", "Diamond", "Quartz", "Titanium"),
     1
 ));

 questions.add(new Question(
     "Which organization awards the Nobel Prize?",
     Arrays.asList("UNESCO", "Swedish Academy", "WHO", "Royal Society"),
     1
 ));

 questions.add(new Question(
     "Which planet has the shortest day?",
     Arrays.asList("Mars", "Earth", "Jupiter", "Venus"),
     2
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 6
//=========================
public static List<Question> getGkHardLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the highest number of UNESCO World Heritage Sites?",
     Arrays.asList("China", "Italy", "India", "Spain"),
     1
 ));

 questions.add(new Question(
     "Who was the first person to orbit the Earth?",
     Arrays.asList("Neil Armstrong", "Yuri Gagarin", "Buzz Aldrin", "Alan Shepard"),
     1
 ));

 questions.add(new Question(
     "Which river forms the border between the USA and Mexico?",
     Arrays.asList("Mississippi", "Colorado", "Rio Grande", "Amazon"),
     2
 ));

 questions.add(new Question(
     "Which Indian Constitution amendment lowered voting age to 18?",
     Arrays.asList("42nd", "44th", "61st", "73rd"),
     2
 ));

 questions.add(new Question(
     "Which element is used in nuclear reactors as fuel?",
     Arrays.asList("Uranium", "Copper", "Zinc", "Helium"),
     0
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 7
//=========================
public static List<Question> getGkHardLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which philosopher wrote 'The Republic'?",
     Arrays.asList("Aristotle", "Plato", "Socrates", "Descartes"),
     1
 ));

 questions.add(new Question(
     "Which country launched the first artificial satellite?",
     Arrays.asList("USA", "China", "USSR", "Germany"),
     2
 ));

 questions.add(new Question(
     "Which is the smallest ocean in the world?",
     Arrays.asList("Indian", "Arctic", "Atlantic", "Southern"),
     1
 ));

 questions.add(new Question(
     "Which treaty established the European Union?",
     Arrays.asList("Treaty of Rome", "Maastricht Treaty", "Treaty of Lisbon", "Treaty of Paris"),
     1
 ));

 questions.add(new Question(
     "Which scientist is known as the father of modern chemistry?",
     Arrays.asList("Antoine Lavoisier", "John Dalton", "Dmitri Mendeleev", "Robert Boyle"),
     0
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 8
//=========================
public static List<Question> getGkHardLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the most natural lakes?",
     Arrays.asList("Canada", "Russia", "USA", "Brazil"),
     0
 ));

 questions.add(new Question(
     "Who wrote the economic theory in 'The Wealth of Nations'?",
     Arrays.asList("Karl Marx", "Adam Smith", "John Keynes", "David Ricardo"),
     1
 ));

 questions.add(new Question(
     "Which desert is the largest hot desert in the world?",
     Arrays.asList("Gobi", "Sahara", "Arabian", "Kalahari"),
     1
 ));

 questions.add(new Question(
     "Which Indian state has the highest literacy rate?",
     Arrays.asList("Tamil Nadu", "Maharashtra", "Kerala", "Punjab"),
     2
 ));

 questions.add(new Question(
     "Which planet rotates in the opposite direction to most planets?",
     Arrays.asList("Mars", "Jupiter", "Venus", "Saturn"),
     2
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 9
//=========================
public static List<Question> getGkHardLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the highest mountain peak in the world?",
     Arrays.asList("India", "China", "Nepal", "Bhutan"),
     2
 ));

 questions.add(new Question(
     "Who was the first President of the United States?",
     Arrays.asList("Thomas Jefferson", "George Washington", "Abraham Lincoln", "John Adams"),
     1
 ));

 questions.add(new Question(
     "Which element has the chemical symbol 'Fe'?",
     Arrays.asList("Fluorine", "Iron", "Zinc", "Silver"),
     1
 ));

 questions.add(new Question(
     "Which strait separates Asia and North America?",
     Arrays.asList("Malacca Strait", "Bering Strait", "Hormuz Strait", "Bosporus Strait"),
     1
 ));

 questions.add(new Question(
     "Which Indian movement was launched in 1942?",
     Arrays.asList("Non-Cooperation Movement", "Quit India Movement", "Civil Disobedience Movement", "Swadeshi Movement"),
     1
 ));

 return questions;
}
//=========================
//GK → HARD → LEVEL 10
//=========================
public static List<Question> getGkHardLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which country has the longest railway network in the world?",
     Arrays.asList("USA", "China", "Russia", "India"),
     0
 ));

 questions.add(new Question(
     "Who discovered penicillin?",
     Arrays.asList("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Joseph Lister"),
     0
 ));

 questions.add(new Question(
     "Which planet has the largest volcano in the solar system?",
     Arrays.asList("Earth", "Mars", "Jupiter", "Venus"),
     1
 ));

 questions.add(new Question(
     "Which battle marked the end of Napoleon's rule?",
     Arrays.asList("Battle of Waterloo", "Battle of Leipzig", "Battle of Austerlitz", "Battle of Trafalgar"),
     0
 ));

 questions.add(new Question(
     "Which Indian scientist won the Nobel Prize in Physics in 1930?",
     Arrays.asList("C. V. Raman", "Homi Bhabha", "S. N. Bose", "Vikram Sarabhai"),
     0
 ));

 return questions;
}

//=========================
//ENTERTAINMENT → EASY → LEVEL 1
//=========================
public static List<Question> getEntertainmentEasyLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Who is known as the King of Pop?",
     Arrays.asList("Elvis Presley", "Michael Jackson", "Justin Bieber", "Bruno Mars"),
     1
 ));

 questions.add(new Question(
     "Which movie features the character Harry Potter?",
     Arrays.asList("Lord of the Rings", "Harry Potter", "Twilight", "Avengers"),
     1
 ));

 questions.add(new Question(
     "Which actor played Iron Man?",
     Arrays.asList("Chris Evans", "Robert Downey Jr.", "Chris Hemsworth", "Tom Holland"),
     1
 ));

 questions.add(new Question(
     "Which cartoon character lives in a pineapple?",
     Arrays.asList("Mickey Mouse", "Tom", "SpongeBob", "Doraemon"),
     2
 ));

 questions.add(new Question(
     "Which movie is about dinosaurs?",
     Arrays.asList("Avatar", "Jurassic Park", "Titanic", "Inception"),
     1
 ));

 return questions;
} 
//=========================
//ENTERTAINMENT → EASY → LEVEL 2
//=========================
public static List<Question> getEntertainmentEasyLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won the Oscar for Best Picture in 1998?",
     Arrays.asList("Titanic", "Avatar", "Inception", "Gladiator"),
     0
 ));

 questions.add(new Question(
     "Who played the role of Jack in Titanic?",
     Arrays.asList("Brad Pitt", "Johnny Depp", "Leonardo DiCaprio", "Tom Cruise"),
     2
 ));

 questions.add(new Question(
     "Which TV show features characters Ross and Rachel?",
     Arrays.asList("Friends", "Breaking Bad", "Dark", "Money Heist"),
     0
 ));

 questions.add(new Question(
     "Which movie series has a character named Frodo?",
     Arrays.asList("Harry Potter", "Star Wars", "Lord of the Rings", "Narnia"),
     2
 ));

 questions.add(new Question(
     "Which actress played Wonder Woman?",
     Arrays.asList("Scarlett Johansson", "Gal Gadot", "Emma Watson", "Natalie Portman"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 3
//=========================
public static List<Question> getEntertainmentEasyLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie features the character Elsa?",
     Arrays.asList("Frozen", "Moana", "Tangled", "Brave"),
     0
 ));

 questions.add(new Question(
     "Who is known as the 'Queen of Pop'?",
     Arrays.asList("Madonna", "Beyonce", "Lady Gaga", "Rihanna"),
     0
 ));

 questions.add(new Question(
     "Which superhero is known as the 'Caped Crusader'?",
     Arrays.asList("Superman", "Batman", "Spider-Man", "Iron Man"),
     1
 ));

 questions.add(new Question(
     "Which animated movie features talking toys?",
     Arrays.asList("Cars", "Toy Story", "Coco", "Up"),
     1
 ));

 questions.add(new Question(
     "Which actor played Captain America?",
     Arrays.asList("Chris Evans", "Chris Hemsworth", "Robert Downey Jr.", "Mark Ruffalo"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 4
//=========================
public static List<Question> getEntertainmentEasyLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie is about a sinking ship?",
     Arrays.asList("Titanic", "Poseidon", "Avatar", "Gladiator"),
     0
 ));

 questions.add(new Question(
     "Who sang the song 'Shape of You'?",
     Arrays.asList("Ed Sheeran", "Justin Bieber", "Drake", "Bruno Mars"),
     0
 ));

 questions.add(new Question(
     "Which wizarding school does Harry Potter attend?",
     Arrays.asList("Beauxbatons", "Durmstrang", "Hogwarts", "Ilvermorny"),
     2
 ));

 questions.add(new Question(
     "Which TV show features Sheldon Cooper?",
     Arrays.asList("Friends", "The Big Bang Theory", "How I Met Your Mother", "Modern Family"),
     1
 ));

 questions.add(new Question(
     "Which movie features a character named Simba?",
     Arrays.asList("Aladdin", "The Lion King", "Frozen", "Mulan"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 5
//=========================
public static List<Question> getEntertainmentEasyLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie series features a character named Katniss Everdeen?",
     Arrays.asList("Divergent", "The Hunger Games", "Twilight", "Maze Runner"),
     1
 ));

 questions.add(new Question(
     "Who directed the movie 'Avatar'?",
     Arrays.asList("Christopher Nolan", "Steven Spielberg", "James Cameron", "Ridley Scott"),
     2
 ));

 questions.add(new Question(
     "Which singer is known as the 'King of Pop'?",
     Arrays.asList("Elvis Presley", "Michael Jackson", "Prince", "Usher"),
     1
 ));

 questions.add(new Question(
     "Which streaming platform created the series 'Stranger Things'?",
     Arrays.asList("Netflix", "Amazon Prime", "Disney+", "Hulu"),
     0
 ));

 questions.add(new Question(
     "Which movie features dinosaurs in a theme park?",
     Arrays.asList("Jumanji", "Jurassic Park", "King Kong", "Godzilla"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 6
//=========================
public static List<Question> getEntertainmentEasyLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie features a character named Jack Sparrow?",
     Arrays.asList("Harry Potter", "Pirates of the Caribbean", "Avatar", "Star Wars"),
     1
 ));

 questions.add(new Question(
     "Who played Spider-Man in the MCU?",
     Arrays.asList("Tom Holland", "Andrew Garfield", "Tobey Maguire", "Chris Evans"),
     0
 ));

 questions.add(new Question(
     "Which movie is about blue alien beings on Pandora?",
     Arrays.asList("Avatar", "Interstellar", "Gravity", "The Martian"),
     0
 ));

 questions.add(new Question(
     "Which singer released the album 'Thriller'?",
     Arrays.asList("Prince", "Michael Jackson", "Elvis Presley", "Bruno Mars"),
     1
 ));

 questions.add(new Question(
     "Which animated movie features the character Woody?",
     Arrays.asList("Cars", "Toy Story", "Up", "Frozen"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 7
//=========================
public static List<Question> getEntertainmentEasyLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie features the superhero Black Panther?",
     Arrays.asList("Avengers", "Black Panther", "Thor", "Iron Man"),
     1
 ));

 questions.add(new Question(
     "Which TV show is set in Hawkins, Indiana?",
     Arrays.asList("Dark", "Stranger Things", "The Office", "Friends"),
     1
 ));

 questions.add(new Question(
     "Who sang 'Rolling in the Deep'?",
     Arrays.asList("Adele", "Taylor Swift", "Beyonce", "Rihanna"),
     0
 ));

 questions.add(new Question(
     "Which movie features a talking snowman named Olaf?",
     Arrays.asList("Frozen", "Moana", "Encanto", "Brave"),
     0
 ));

 questions.add(new Question(
     "Which actor played Thor?",
     Arrays.asList("Chris Evans", "Chris Hemsworth", "Mark Ruffalo", "Tom Holland"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 8
//=========================
public static List<Question> getEntertainmentEasyLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie features a clownfish named Nemo?",
     Arrays.asList("Shrek", "Finding Nemo", "Cars", "Up"),
     1
 ));

 questions.add(new Question(
     "Who played Iron Man in the Marvel movies?",
     Arrays.asList("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"),
     0
 ));

 questions.add(new Question(
     "Which movie series features Hogwarts School?",
     Arrays.asList("Narnia", "Harry Potter", "Star Wars", "Twilight"),
     1
 ));

 questions.add(new Question(
     "Which singer is known for the song 'Bad Guy'?",
     Arrays.asList("Ariana Grande", "Billie Eilish", "Dua Lipa", "Selena Gomez"),
     1
 ));

 questions.add(new Question(
     "Which movie features superheroes teaming up in New York?",
     Arrays.asList("Justice League", "Avengers", "X-Men", "Fantastic Four"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 9
//=========================
public static List<Question> getEntertainmentEasyLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie features a genie played by Robin Williams?",
     Arrays.asList("Aladdin", "Frozen", "Moana", "Shrek"),
     0
 ));

 questions.add(new Question(
     "Who is the lead singer of the band Coldplay?",
     Arrays.asList("Ed Sheeran", "Chris Martin", "Bruno Mars", "Adam Levine"),
     1
 ));

 questions.add(new Question(
     "Which superhero is also known as the 'Man of Steel'?",
     Arrays.asList("Batman", "Superman", "Thor", "Hulk"),
     1
 ));

 questions.add(new Question(
     "Which movie features a character named Dory?",
     Arrays.asList("Finding Nemo", "Shrek", "Ice Age", "Up"),
     0
 ));

 questions.add(new Question(
     "Which actor played Jack Sparrow?",
     Arrays.asList("Johnny Depp", "Orlando Bloom", "Leonardo DiCaprio", "Brad Pitt"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → EASY → LEVEL 10
//=========================
public static List<Question> getEntertainmentEasyLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie features a house lifted by balloons?",
     Arrays.asList("Up", "Toy Story", "Cars", "Coco"),
     0
 ));

 questions.add(new Question(
     "Who sang the hit song 'Blinding Lights'?",
     Arrays.asList("Drake", "The Weeknd", "Justin Bieber", "Shawn Mendes"),
     1
 ));

 questions.add(new Question(
     "Which movie series features the character Dom Toretto?",
     Arrays.asList("Fast & Furious", "Mission Impossible", "Transformers", "John Wick"),
     0
 ));

 questions.add(new Question(
     "Which animated movie features the Madrigal family?",
     Arrays.asList("Encanto", "Frozen", "Moana", "Tangled"),
     0
 ));

 questions.add(new Question(
     "Which TV show features a coffee shop named Central Perk?",
     Arrays.asList("Friends", "How I Met Your Mother", "The Office", "Brooklyn Nine-Nine"),
     0
 ));

 return questions;
}

//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 1
//=========================
public static List<Question> getEntertainmentMediumLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won the Oscar for Best Picture in 2020?",
     Arrays.asList("1917", "Joker", "Parasite", "Ford v Ferrari"),
     2
 ));

 questions.add(new Question(
     "Who directed the movie 'Inception'?",
     Arrays.asList("Steven Spielberg", "Christopher Nolan", "James Cameron", "Martin Scorsese"),
     1
 ));

 questions.add(new Question(
     "Which series features a character named Eleven?",
     Arrays.asList("Dark", "Stranger Things", "Breaking Bad", "The Witcher"),
     1
 ));

 questions.add(new Question(
     "Which actor played the Joker in 'The Dark Knight'?",
     Arrays.asList("Joaquin Phoenix", "Heath Ledger", "Jared Leto", "Christian Bale"),
     1
 ));

 questions.add(new Question(
     "Which movie is based on the sinking of a famous ship?",
     Arrays.asList("Titanic", "Avatar", "Gladiator", "Frozen"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 2
//=========================
public static List<Question> getEntertainmentMediumLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which actor played Thor in Marvel movies?",
     Arrays.asList("Chris Evans", "Chris Hemsworth", "Mark Ruffalo", "Tom Hiddleston"),
     1
 ));

 questions.add(new Question(
     "Which film features the character 'Neo'?",
     Arrays.asList("The Matrix", "John Wick", "Interstellar", "Gladiator"),
     0
 ));

 questions.add(new Question(
     "Which TV show is set in the fictional continent of Westeros?",
     Arrays.asList("The Witcher", "Game of Thrones", "Vikings", "Dark"),
     1
 ));

 questions.add(new Question(
     "Who composed the music for many Disney animated films?",
     Arrays.asList("Hans Zimmer", "Alan Menken", "A. R. Rahman", "John Williams"),
     1
 ));

 questions.add(new Question(
     "Which movie series features the character Jack Sparrow?",
     Arrays.asList("Harry Potter", "Pirates of the Caribbean", "Lord of the Rings", "Star Wars"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 3
//=========================
public static List<Question> getEntertainmentMediumLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won the Oscar for Best Picture in 2019?",
     Arrays.asList("Green Book", "1917", "Joker", "Parasite"),
     0
 ));

 questions.add(new Question(
     "Who directed the movie 'Titanic'?",
     Arrays.asList("Steven Spielberg", "James Cameron", "Christopher Nolan", "Ridley Scott"),
     1
 ));

 questions.add(new Question(
     "Which series features the character Jon Snow?",
     Arrays.asList("Vikings", "Game of Thrones", "The Witcher", "Dark"),
     1
 ));

 questions.add(new Question(
     "Which actor played the Joker in the 2019 film 'Joker'?",
     Arrays.asList("Heath Ledger", "Joaquin Phoenix", "Jared Leto", "Christian Bale"),
     1
 ));

 questions.add(new Question(
     "Which movie features dreams within dreams?",
     Arrays.asList("Interstellar", "Inception", "Tenet", "Shutter Island"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 4
//=========================
public static List<Question> getEntertainmentMediumLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which actor played Wolverine in the X-Men series?",
     Arrays.asList("Hugh Jackman", "Chris Evans", "Ryan Reynolds", "Tom Hardy"),
     0
 ));

 questions.add(new Question(
     "Which movie is based on the novel by J.R.R. Tolkien?",
     Arrays.asList("Harry Potter", "The Hobbit", "Narnia", "Twilight"),
     1
 ));

 questions.add(new Question(
     "Which singer released the album '25'?",
     Arrays.asList("Adele", "Taylor Swift", "Rihanna", "Beyonce"),
     0
 ));

 questions.add(new Question(
     "Which TV series is set in a paper company called Dunder Mifflin?",
     Arrays.asList("Friends", "The Office", "Modern Family", "Brooklyn Nine-Nine"),
     1
 ));

 questions.add(new Question(
     "Which movie features a character named Maximus?",
     Arrays.asList("Troy", "Gladiator", "300", "Spartacus"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 5
//=========================
public static List<Question> getEntertainmentMediumLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won Best Animated Feature in 2021?",
     Arrays.asList("Encanto", "Soul", "Coco", "Frozen II"),
     0
 ));

 questions.add(new Question(
     "Who composed the music for 'The Lion King' (1994)?",
     Arrays.asList("Hans Zimmer", "John Williams", "Alan Menken", "A. R. Rahman"),
     0
 ));

 questions.add(new Question(
     "Which actor played Neo in 'The Matrix'?",
     Arrays.asList("Keanu Reeves", "Brad Pitt", "Matt Damon", "Leonardo DiCaprio"),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Katniss Everdeen?",
     Arrays.asList("Divergent", "The Hunger Games", "Maze Runner", "Twilight"),
     1
 ));

 questions.add(new Question(
     "Which TV show features a chemistry teacher turned drug manufacturer?",
     Arrays.asList("Breaking Bad", "Dark", "Narcos", "Prison Break"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 6
//=========================
public static List<Question> getEntertainmentMediumLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won the Oscar for Best Picture in 2018?",
     Arrays.asList("The Shape of Water", "La La Land", "Moonlight", "Spotlight"),
     0
 ));

 questions.add(new Question(
     "Who directed the movie 'The Dark Knight'?",
     Arrays.asList("Christopher Nolan", "Steven Spielberg", "James Cameron", "Martin Scorsese"),
     0
 ));

 questions.add(new Question(
     "Which series features the character Walter White?",
     Arrays.asList("Narcos", "Breaking Bad", "Ozark", "Dark"),
     1
 ));

 questions.add(new Question(
     "Which actress played Hermione Granger?",
     Arrays.asList("Emma Stone", "Emma Watson", "Jennifer Lawrence", "Natalie Portman"),
     1
 ));

 questions.add(new Question(
     "Which movie is set on the planet Arrakis?",
     Arrays.asList("Star Wars", "Dune", "Avatar", "Interstellar"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 7
//=========================
public static List<Question> getEntertainmentMediumLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which actor played Doctor Strange?",
     Arrays.asList("Benedict Cumberbatch", "Tom Holland", "Chris Evans", "Robert Downey Jr."),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Arthur Fleck?",
     Arrays.asList("Joker", "Batman Begins", "The Batman", "Suicide Squad"),
     0
 ));

 questions.add(new Question(
     "Which band released the album 'Abbey Road'?",
     Arrays.asList("The Beatles", "Queen", "Pink Floyd", "The Rolling Stones"),
     0
 ));

 questions.add(new Question(
     "Which TV show is set in the fictional town of Riverdale?",
     Arrays.asList("Riverdale", "Gossip Girl", "Elite", "Outer Banks"),
     0
 ));

 questions.add(new Question(
     "Which movie features time travel using a DeLorean car?",
     Arrays.asList("Back to the Future", "Looper", "Tenet", "The Time Machine"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 8
//=========================
public static List<Question> getEntertainmentMediumLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won Best Picture at the Oscars in 2022?",
     Arrays.asList("CODA", "Dune", "The Power of the Dog", "Belfast"),
     0
 ));

 questions.add(new Question(
     "Who composed the music for 'Star Wars'?",
     Arrays.asList("Hans Zimmer", "John Williams", "Alan Menken", "Howard Shore"),
     1
 ));

 questions.add(new Question(
     "Which series features a character named Geralt of Rivia?",
     Arrays.asList("The Witcher", "Game of Thrones", "Vikings", "Dark"),
     0
 ));

 questions.add(new Question(
     "Which actor played Jack in 'Titanic'?",
     Arrays.asList("Brad Pitt", "Johnny Depp", "Leonardo DiCaprio", "Matt Damon"),
     2
 ));

 questions.add(new Question(
     "Which movie features the quote 'Why so serious?'",
     Arrays.asList("Joker", "The Dark Knight", "Batman Begins", "Suicide Squad"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 9
//=========================
public static List<Question> getEntertainmentMediumLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won the Oscar for Best Picture in 2017?",
     Arrays.asList("La La Land", "Moonlight", "Arrival", "Manchester by the Sea"),
     1
 ));

 questions.add(new Question(
     "Who directed the movie 'Pulp Fiction'?",
     Arrays.asList("Martin Scorsese", "Christopher Nolan", "Quentin Tarantino", "Steven Spielberg"),
     2
 ));

 questions.add(new Question(
     "Which series features a character named Eleven?",
     Arrays.asList("Dark", "Stranger Things", "The Boys", "Lost"),
     1
 ));

 questions.add(new Question(
     "Which actor played Batman in 'The Dark Knight' trilogy?",
     Arrays.asList("Ben Affleck", "Christian Bale", "Robert Pattinson", "Michael Keaton"),
     1
 ));

 questions.add(new Question(
     "Which movie features the character Maverick?",
     Arrays.asList("Top Gun", "Mission Impossible", "Fast & Furious", "Transformers"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → MEDIUM → LEVEL 10
//=========================
public static List<Question> getEntertainmentMediumLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won Best Picture at the Oscars in 2023?",
     Arrays.asList("Everything Everywhere All at Once", "Avatar: The Way of Water", "Top Gun: Maverick", "Elvis"),
     0
 ));

 questions.add(new Question(
     "Who composed the soundtrack for 'Interstellar'?",
     Arrays.asList("Hans Zimmer", "John Williams", "Howard Shore", "Alan Silvestri"),
     0
 ));

 questions.add(new Question(
     "Which series is based on the novels by George R.R. Martin?",
     Arrays.asList("The Witcher", "Game of Thrones", "Vikings", "The Last Kingdom"),
     1
 ));

 questions.add(new Question(
     "Which actor played the Joker in 'The Dark Knight' (2008)?",
     Arrays.asList("Heath Ledger", "Joaquin Phoenix", "Jared Leto", "Jack Nicholson"),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Tony Montana?",
     Arrays.asList("The Godfather", "Scarface", "Goodfellas", "Casino"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 1
//=========================
public static List<Question> getEntertainmentHardLevel1Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won the first Academy Award for Best Picture?",
     Arrays.asList("Wings", "Gone with the Wind", "Casablanca", "Citizen Kane"),
     0
 ));

 questions.add(new Question(
     "Who composed the soundtrack for the movie 'Interstellar'?",
     Arrays.asList("John Williams", "Hans Zimmer", "A. R. Rahman", "James Horner"),
     1
 ));

 questions.add(new Question(
     "Which actor portrayed Iron Man in the Marvel Cinematic Universe?",
     Arrays.asList("Chris Evans", "Robert Downey Jr.", "Mark Ruffalo", "Chris Hemsworth"),
     1
 ));

 questions.add(new Question(
     "Which TV series holds the record for most Emmy wins?",
     Arrays.asList("Friends", "Game of Thrones", "Breaking Bad", "The Office"),
     1
 ));

 questions.add(new Question(
     "Which director is known for the 'Dark Knight Trilogy'?",
     Arrays.asList("Steven Spielberg", "Christopher Nolan", "James Cameron", "Ridley Scott"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 2
//=========================
public static List<Question> getEntertainmentHardLevel2Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film is based on the novel by Mario Puzo?",
     Arrays.asList("Scarface", "The Godfather", "Goodfellas", "The Irishman"),
     1
 ));

 questions.add(new Question(
     "Which animated film was the first feature-length animation by Disney?",
     Arrays.asList("Cinderella", "Snow White and the Seven Dwarfs", "Bambi", "Fantasia"),
     1
 ));

 questions.add(new Question(
     "Who played the character of Jack Dawson in Titanic?",
     Arrays.asList("Brad Pitt", "Tom Cruise", "Leonardo DiCaprio", "Johnny Depp"),
     2
 ));

 questions.add(new Question(
     "Which series is based on books written by George R.R. Martin?",
     Arrays.asList("The Witcher", "Game of Thrones", "Vikings", "Dark"),
     1
 ));

 questions.add(new Question(
     "Which movie features the quote 'May the Force be with you'?",
     Arrays.asList("Star Trek", "Avatar", "Star Wars", "The Matrix"),
     2
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 3
//=========================
public static List<Question> getEntertainmentHardLevel3Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film won the Academy Award for Best Picture in 1994?",
     Arrays.asList("Forrest Gump", "Pulp Fiction", "The Shawshank Redemption", "Braveheart"),
     0
 ));

 questions.add(new Question(
     "Who directed the movie 'Schindler's List'?",
     Arrays.asList("Steven Spielberg", "Martin Scorsese", "James Cameron", "Christopher Nolan"),
     0
 ));

 questions.add(new Question(
     "Which actor portrayed Vito Corleone in 'The Godfather' (1972)?",
     Arrays.asList("Al Pacino", "Marlon Brando", "Robert De Niro", "James Caan"),
     1
 ));

 questions.add(new Question(
     "Which TV series is based on the novel series 'A Song of Ice and Fire'?",
     Arrays.asList("Vikings", "The Witcher", "Game of Thrones", "Rome"),
     2
 ));

 questions.add(new Question(
     "Which movie features the character Travis Bickle?",
     Arrays.asList("Taxi Driver", "Goodfellas", "Scarface", "The Departed"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 4
//=========================
public static List<Question> getEntertainmentHardLevel4Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film won the first ever Academy Award for Best Animated Feature?",
     Arrays.asList("Shrek", "Toy Story", "Spirited Away", "Finding Nemo"),
     0
 ));

 questions.add(new Question(
     "Who composed the music for 'The Lord of the Rings' trilogy?",
     Arrays.asList("Hans Zimmer", "John Williams", "Howard Shore", "Alan Menken"),
     2
 ));

 questions.add(new Question(
     "Which actor played Daniel Plainview in 'There Will Be Blood'?",
     Arrays.asList("Leonardo DiCaprio", "Daniel Day-Lewis", "Brad Pitt", "Joaquin Phoenix"),
     1
 ));

 questions.add(new Question(
     "Which movie features the character Anton Chigurh?",
     Arrays.asList("No Country for Old Men", "Fargo", "The Departed", "Heat"),
     0
 ));

 questions.add(new Question(
     "Which director is known for the film 'Parasite'?",
     Arrays.asList("Park Chan-wook", "Bong Joon-ho", "Kim Ki-duk", "Lee Chang-dong"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 5
//=========================
public static List<Question> getEntertainmentHardLevel5Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film won Best Picture at the 2000 Academy Awards?",
     Arrays.asList("Gladiator", "American Beauty", "The Green Mile", "The Sixth Sense"),
     1
 ));

 questions.add(new Question(
     "Who directed the movie 'The Grand Budapest Hotel'?",
     Arrays.asList("Wes Anderson", "Quentin Tarantino", "Christopher Nolan", "David Fincher"),
     0
 ));

 questions.add(new Question(
     "Which actor played Jordan Belfort in 'The Wolf of Wall Street'?",
     Arrays.asList("Matt Damon", "Leonardo DiCaprio", "Brad Pitt", "Christian Bale"),
     1
 ));

 questions.add(new Question(
     "Which TV series features the character Tony Soprano?",
     Arrays.asList("Breaking Bad", "The Sopranos", "Ozark", "Narcos"),
     1
 ));

 questions.add(new Question(
     "Which movie features the character Tyler Durden?",
     Arrays.asList("Se7en", "Fight Club", "The Machinist", "Gone Girl"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 6
//=========================
public static List<Question> getEntertainmentHardLevel6Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which movie won Best Picture in 2003?",
     Arrays.asList("Chicago", "The Pianist", "The Lord of the Rings: The Return of the King", "Gangs of New York"),
     2
 ));

 questions.add(new Question(
     "Who composed the score for 'Inception'?",
     Arrays.asList("John Williams", "Hans Zimmer", "Howard Shore", "Danny Elfman"),
     1
 ));

 questions.add(new Question(
     "Which actor portrayed Hannibal Lecter in 'The Silence of the Lambs'?",
     Arrays.asList("Anthony Hopkins", "Al Pacino", "Robert De Niro", "Jack Nicholson"),
     0
 ));

 questions.add(new Question(
     "Which series features the character Saul Goodman?",
     Arrays.asList("Breaking Bad", "Better Call Saul", "The Wire", "Mad Men"),
     1
 ));

 questions.add(new Question(
     "Which movie features the character Donnie Darko?",
     Arrays.asList("Memento", "Donnie Darko", "The Prestige", "Shutter Island"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 7
//=========================
public static List<Question> getEntertainmentHardLevel7Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which director made the movie '2001: A Space Odyssey'?",
     Arrays.asList("Stanley Kubrick", "Ridley Scott", "Steven Spielberg", "James Cameron"),
     0
 ));

 questions.add(new Question(
     "Which film won Best Picture in 2014?",
     Arrays.asList("Gravity", "12 Years a Slave", "Her", "The Wolf of Wall Street"),
     1
 ));

 questions.add(new Question(
     "Which actor played the role of Commodus in 'Gladiator'?",
     Arrays.asList("Russell Crowe", "Joaquin Phoenix", "Tom Hardy", "Christian Bale"),
     1
 ));

 questions.add(new Question(
     "Which TV series features the character Omar Little?",
     Arrays.asList("The Wire", "Breaking Bad", "True Detective", "Fargo"),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Patrick Bateman?",
     Arrays.asList("American Psycho", "Fight Club", "Se7en", "Gone Girl"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 8
//=========================
public static List<Question> getEntertainmentHardLevel8Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film won the Palme d'Or at Cannes in 2019?",
     Arrays.asList("Parasite", "Roma", "Joker", "1917"),
     0
 ));

 questions.add(new Question(
     "Who directed the movie 'The Irishman'?",
     Arrays.asList("Quentin Tarantino", "Martin Scorsese", "Steven Spielberg", "Christopher Nolan"),
     1
 ));

 questions.add(new Question(
     "Which actor played Lester Burnham in 'American Beauty'?",
     Arrays.asList("Kevin Spacey", "Brad Pitt", "Tom Hanks", "Russell Crowe"),
     0
 ));

 questions.add(new Question(
     "Which series features the character Rust Cohle?",
     Arrays.asList("True Detective", "Mindhunter", "The Wire", "Fargo"),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Nina Sayers?",
     Arrays.asList("Black Swan", "Gone Girl", "The Prestige", "Requiem for a Dream"),
     0
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 9
//=========================
public static List<Question> getEntertainmentHardLevel9Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film won Best Picture at the 1999 Academy Awards?",
     Arrays.asList("Saving Private Ryan", "Shakespeare in Love", "The Thin Red Line", "Life Is Beautiful"),
     1
 ));

 questions.add(new Question(
     "Who composed the score for 'The Dark Knight'?",
     Arrays.asList("Hans Zimmer", "John Williams", "Howard Shore", "Danny Elfman"),
     0
 ));

 questions.add(new Question(
     "Which actor played Daniel LaRusso in 'The Karate Kid' (1984)?",
     Arrays.asList("Ralph Macchio", "Tom Cruise", "Matt Dillon", "Rob Lowe"),
     0
 ));

 questions.add(new Question(
     "Which TV series features the character Carrie Mathison?",
     Arrays.asList("Homeland", "24", "Scandal", "The Americans"),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Randle McMurphy?",
     Arrays.asList("The Shining", "One Flew Over the Cuckoo's Nest", "Taxi Driver", "Goodfellas"),
     1
 ));

 return questions;
}
//=========================
//ENTERTAINMENT → HARD → LEVEL 10
//=========================
public static List<Question> getEntertainmentHardLevel10Questions() {

 List<Question> questions = new ArrayList<>();

 questions.add(new Question(
     "Which film won the first Academy Award for Best Picture in 1929?",
     Arrays.asList("Wings", "Sunrise", "Metropolis", "The Jazz Singer"),
     0
 ));

 questions.add(new Question(
     "Who directed the movie 'Citizen Kane'?",
     Arrays.asList("Orson Welles", "Alfred Hitchcock", "Billy Wilder", "Stanley Kubrick"),
     0
 ));

 questions.add(new Question(
     "Which actor portrayed Michael Corleone in 'The Godfather'?",
     Arrays.asList("Robert De Niro", "Al Pacino", "Marlon Brando", "James Caan"),
     1
 ));

 questions.add(new Question(
     "Which series features the character Don Draper?",
     Arrays.asList("Mad Men", "Breaking Bad", "The Wire", "The Sopranos"),
     0
 ));

 questions.add(new Question(
     "Which movie features the character Norman Bates?",
     Arrays.asList("Psycho", "The Birds", "Vertigo", "Rear Window"),
     0
 ));

 return questions;
}
}