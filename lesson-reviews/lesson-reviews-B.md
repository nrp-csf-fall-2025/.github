# Lesson Reviews - Part B

Notes and review questions for lessons 18-32.

### 18:Imports and Libraries

Notes:

- Learning how to make sense of Java library documentation takes practice. Don't
  skip the videos that give you a glimpse into the `Random`, `Math`, and
  `Arrays` classes. After watching the videos, take a few minutes to look up the
  classes on your own. Browse some methods. Practice parsing the documentation:
  what kind of inputs does the method take? What kind of value does it return?
  While it won't mean much yet, at least notice which are **static** and which
  are **instance** methods.
- To solve the practice problem, you'll need to browse the `java.time` library
  to find a suitable class and method. Start with what you've already seen:
  `Instant`. You know what you have available for input -- a `long` representing
  milliseconds. So start by looking for a method that accepts milliseconds as
  input.
- Maybe you're feeling frustrated that you have to look up methods you've never
  seen before in order to solve the problems. Poor you. That's what pros do ALL.
  THE. TIME. Get used to it.

1. What is the purpose of the `import` statement in Java?
2. Why can you use (for example) `Math.sqrt()` without an import statement, but
   you need to import `java.util.Random` to use the `Random` class?
3. If you want to import that `Random` class, why do you need to
   `import java.util.Random` instead of just `import Random`?

### 19:Lists and Type Parameters

Notes:

- This lesson is the first in a series on Java _Collections_: data structures
  provided by the Java standard library that make it easier to store and
  manipulate groups of related data. The first collection you'll learn about is
  the `ArrayList`. `ArrayList` **is** tested on the AP exam.

1. Compare arrays and `ArrayList`s. How are they similar? How are they
   different? When might you choose one over the other?
2. List some methods that `ArrayList`s have that arrays do not.
3. Write pseudocode that gives you a template for declaring and initializing an
   `ArrayList`. Keep in mind that you need to specify what type of **object**
   (not primative type) the `ArrayList` will hold.
4. Why can't you create an `ArrayList` that holds `int`s or `boolean`s or
   `double`s? What can you do instead?
5. You likely won't have a perfect answer to this question yet, but try anyway:
   why can you use either `List<Integer>` or `ArrayList<Integer>` as the type of
   a variable that holds an `ArrayList` of `Integer`s?
6. Explain what _boxing_ and _unboxing_ are in Java. Give a few examples of
   _autoboxing_ (ocassions when Java will box or unbox automatically).
7. Explain what a _type parameter_ is in Java. Why are they useful? Give
   yourself a few examples.

### 20:Maps and Sets

Notes:

- This lesson introduces two new data structures for collections: **maps** and
  **sets**. Neither is tested on the AP exam, but both are widely used in
  real-world Java programming.
- If you're familiar with Python, a Java `Map` is similar to a Python `dict`,
  and a Java `Set` is similar to a Python `set`.
- Several walkthroughs and practice problems return to the idea that you can use
  `assert` to test your code. In one place, the professor even writes the
  `assert` statements before writing the actual method. This is called
  **test-drive development** (TDD), and some people swear by it.

1. Compare maps, sets, and lists. How are they similar? How are they different?
2. For both maps and sets, write pseudocode that gives you a template for

- declaring and initializing them
- add key-value pairs (for maps) or elements (for sets)
- checking for the presence of a key (for maps) or an element (for sets)
- iterating:
  - maps: over keys and values
  - maps: over keys
  - sets: over elements

3. In the last lesson, we often typed a new `ArrayList` variable with the
   **interface** type `List`. What's the equivalent **interfaces** for `HashMap`
   and `HashSet`?

### 21:Practice with Collections

Notes:

- We've seen arrays of arrays. More generally, collection data types can hold
  _other collection data types_, e.g.:
  - an array (or an `ArrayList`) of maps
  - a map that stores `ArrayList`s as values
  - a map that stores sets as values
- The problems you're asked to solve in this lesson are a little more complex.
  Practice your problem-solving approach. Start by decomposing the problem,
  implementing a simpler piece, and testing as you go.

1. Show how to use a list as a value in a map (including appropriate type
   information). When might it be useful to store a list as a value in a map?
2. Show how to use a map as a value in an `ArrayList` (including appropriate
   type information).

### 22:Compilation and Type Inference

### 23:Introduction to Objects

### 24:Objects, Continued

### 25:Constructors

### 26:Encapsulation

### 27:Static

### 28:Data Modeling 1

### 29:Inheritance

### 30:Polymorphism

### 31:Equality and Object Copying

### 32:Data Modeling 2
