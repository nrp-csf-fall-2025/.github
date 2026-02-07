# Lesson Reviews - Part B (Lessons 28 - 60)

Notes and review questions for lessons 28-60.

This quarter, after the first few lessons, there are no preset questions to
answer. I've only listed what I judge to be key topics. It's up to **you** to
write your own questions and answer them, use the Feynman method, jot down
helpful code examples, or whatever you've found helpful.

Checkpoints:

1. Inheritance (29)
2. Polymorphism (30)
3. Objects III (31)
4. More to come...

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

### 34:References

### 35:References and Polymorphism

### 36:Catching Exceptions

### 37:Throwing Exceptions

### 38:Working with Exceptions

### 39:Using Interfaces

### 40:Implementing Interfaces

### 41:Practice with Interfaces

### 42:Anonymous Classes

### 43:Lambda Expressions

### 44:Algorithms and Lists

### 45:Linked Lists

### 46:Lists Review and Performance

### 47:Recursion

### 48:Trees

### 49:Trees and Recursion

### 50:Practice with Recursion

### 51:Sorting Algorithms

### 52:Merge Sort

### 53:Quicksort

### 54:Binary Search

### 55:Hashing

### 56:Implementing a Map

### 57:Generics

### 58:Streams

### 59:Graphs

### 60:Graph Algorithms
