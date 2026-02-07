# Lesson Reviews - Part B (Lessons 18 - 32)

Notes and review questions for lessons 18-32.

Checkpoints:
1. Collections (after completing lesson 21)
2. Objects I (24)
3. Objects II (27)
4. Inheritance (29)
5. Polymorphism (30)
6. Objects III (31)

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

### 21:Practice with Collections (Checkpoint: Collections)

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

Notes:

- Type inference was introduced in Java 10. For the AP exam, you are restricted
  to Java language features that exist in Java 8. So spend time understanding
  type inference and feel free to use it in the code you write, but DO NOT rely
  on type inference on the exam.

1. Before a Java program can be executed, it must be **compiled**. What is
   compilation? What does the compiler take as input? What does it return as
   output?
2. Why would you not expect to encounter compiler errors "in production"?
3. What type of errors might you encounter "in production"? How can a developer
   guard against these errors?
4. Explain what type inference is. Show an example (or two) of how to declare
   and initialize a variable in such a way that the Java compiler will infer its
   type.

### 23:Introduction to Objects

Notes:

- Back in lesson 13, you learned about the Feynman Technique. Your goal over the
  next few lessons is to build up a clear and simple explanation of classes and
  objects -- an explanation good enough to teach a smart friend what is most
  important about classes and objects. Use the questions below to start to
  identify and shape the pieces of a complete explanation.
- That understanding of classes and objects is a first step toward understanding
  what it means to say that Java is an object-oriented language and what it
  means to program in the object-oriented paradigm.

1. Write a working definition of an **object**.(You'll revise and expand it in
   future lessons.)
2. What is the difference between a **class** and an **instance**?
3. Show how to create an object using the `new` keyword.
4. Show how to access a property of an object using dot notation.

### 24:Objects, Continued (Checkpoint: Objects I)

Notes:

- Use these questions to add and refine to the Feynman-style explanation of
  objects and object-orientation.

1. _Methods_ add _behavior_ to objects. Explain.
2. Why might it be useful to combine in a single object data (attributes or
   properties) and behaviors (methods)?
3. This lesson briefly mentions _getters_ and _setters_. Speculate: why might
   you want to set and access object properties through getter and setter
   methods instead of directly using dot notation?

### 25:Constructors

1. Show how to define a constructor on a class. Be sure to include naming
   requirements and syntax that are unique to constructors.
2. When and how is is a constructor method called?
3. What happens if a class you write does not include a constructor?
4. What is returned from a constructor?
5. What are overloaded constructors? When creating constructors, why might you
   use method overloading?
6. You've been building a Feynman-style explanation of objects. What will you
   say about constructors? In particular, what is the role of the constructor in
   creating _instances_?

### 26:Encapsulation

1. What do the modifiers `public` and `private` do when applied to a field or
   method?
2. Why might you want to make a class's field private?
3. Write out the pattern or template for creating a class with a getter and
   setter for a private field.
4. How would you make a class field **read-only**?
5. Update your in-progress Feynman explanation with what you've learned about
   **encapsulation**.

### 27:Static (Checkpoint: Objects II)

Notes:

- Try **at least** 5 versions of the debugging problem. The code is more complex
  than previous debugging problems and will give you good practice reading code.
  But look out for versions that fail because the code excludes `<>` after
  `HashMap`. You can't fix that unintended bug AND the intentional bug. If you
  run into such a problem, skip past it.

1. Adding `static` to a method makes it a **static method**. What makes a static
   method different from an instance method? Be precise.
2. Why might you write a static method? (That is, what use are they?)
3. Fields can be static, too. Why might you include a static field in a class?
4. How does the keyword `final` modify the behavior of a variable (or
   class/instance field)?
5. Use what you've learned about **static** methods and fields to update your
   in-progress Feynman explanation, especially its explanation of the difference
   between a class and an instance. Spend some time cleaning up and refining
   your Feynman explanation -- there's a good chance you'll be asked about it.

### 28:Data Modeling 1

Notes:

- This lesson walks you through creating a class to model a game of tic-tac-toe.
  More important than the class you end up with is the **process** that gets you
  there. Focus on the repeatable steps that you can take to build a class that
  models something.
- Don't just passively watch the walk throughs. You'll learn more if you
  frequently pause, take time to really think about it, and try to form a
  hypothesis about the next chunk of code. If your prediction doesn't pan out,
  try to figure out why. What did you miss or what did you not (yet) know? Or
  maybe your thought about how to do it turns out to be _better_. In that case,
  try to articulate _why_.
- The walk-through introducing Java `record` classes is a little dated. Because
  the course playgrounds run Java 21, `record` is no longer in "preview".
  `record` won't show up on the AP exam nor should you use them in code you
  write for the exam. But under certain circumstances, `record` classes are a
  shorthand way of creating simple classes. You should still master the patterns
  for creating classes with constructors, getters, and setters (as appropriate).

1. Describe the **process** of building a class to model some entity or process.

### 29:Inheritance (Checkpoint: Inheritance)

1. Explain what it means for one class to **extend** or **inherit** another?
2. Suppose you have defined a class `Example` but have not defined any methods
   belonging to `Example`. Explain why an instance of `Example` nevertheless has
   a `toString` method available.
3. Explain the relationship between `Object` and every other class (including
   those you define).
4. Write out the pattern or template for writing a class that inherits from
   another. Include anything worth remembering about constructors (the class's
   own and its parent's).
5. How does adding the modifier `public` or `private` change the behavior of a
   field or method?
6. When would you add an `@Override` method? What is the value of adding it?
7. Update your Feynman explanation of objects and classes to include what you've
   learned about inheritance.

### 30:Polymorphism (Checkpoint: Polymorphism)

Notes:

- This lesson is a chance to practice your approach to learning a new (and
  somewhat difficult) concept.
  - The lesson itself is _one_ resource. Nothing is stopping you from looking
    elsewhere to round out your understanding. Get good at finding _good_
    resources.
  - Ultimatley _you_ must decide what questions to ask and answer, to determine
    when your understanding is sufficient. Become a good judge of your own
    understanding.
  - Good enough for what? The goal is up to you, too. Choosing proper ends
    requires wisdom, so wise up.
  - I often find it helpful:
    - to make distinctions: what is this new thing like? How is it different?
    - to make connections to what I already know; to try to fit it into the
      universe I know.
    - to reduce it to principles (from which I can reason out the details)
    - to make it practical: how and when would I use it?

1. Draft a Feynman explanation of **polymorphism**.
2. Write out a list of questions you have about polymorphism. Unless your
   Feynman explanation is already extraordinarily good, your list should be
   reasonably long. The better you become at generating questions about a new
   topic, the better you'll become at learning new things.
3. Now pick at least two of your open questions. Go back to the lesson or find
   supplementary resources to find answers.
4. Redraft your Feynman explanation incorporating the questions from #2 and what
   you learned from your targeted research in #3. It's rare that your new
   knowledge is merely _additive_ -- new facts you could just tack on to the end
   of your old explanation. More likely, what you learned recolors what you'd
   previously known. You'll see better what's most fundamental, make new
   connections, have crisper explanations, etc. Your updated explanation should
   reflect these.

### 31:Equality and Object Copying (Checkpoint: Objects III)

1. How does the `equals` method inherited from the base `Object` class determine
   equality? Why would that inherited method not typically be very useful?
2. The `String` class overrides the `Object` class's `equals` method. We've used
   it several times already. Take your best guess at how it works. (And then if
   you're curious, take a look at its
   [implementation](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/lang/String.java#L2088).)
3. What happens if you compare two strings with `==` instead of `String.equals`?
4. Write out the pattern for the first-level checks in a typical `equals`
   method. (Not what would be specific to each class, but the more
   boilerplate-like stuff that you'd check first.)
5. Write out the pattern for a "copy constructor" (a constructor method that
   returns a copy of a class instance.)

### 32:Data Modeling 2

These questions all relate to the series of "Modeling Office Hours"
walk-throughs.

1. What is the value of creating a `Person` class that `Student` and `Staff` can
   extend?
2. Why does it make more sense to add the `enter` and `leave` methods to `Room`
   than (for example) `Person`?
3. What does adding the modifier `abstract` do to the `Person` class? What's the
   value of an `abstract` class?
4. In lesson 28, you reflected on the process of modeling an entity with a
   class. Use what you saw in this lesson to refine and extend what you wrote
   there. In particular, consider new considerations that come into play when
   you're modeling multiple entities that interact with each other.
