# Lesson Reviews - Part A (Lesson 0 - 18)

This semester, you will keep a notebook or binder.

For each `learncs.online` lesson, you must answer the review questions (listed
below). I also encourage you to include:

1. the 3-5 key takeaways
2. 1-2 code examples that illustrate the key takeaways

These lesson reviews are **required** but not graded. I will check them weekly
for adequacy: I will give you informal feedback on the quality of your notes and
answers, but not thoroughly check each for accuracy and completeness.

## Checkpoints

Many lessons have associated "checkpoints": short assessments to measure your
mastery.

- Before you can attempt a checkpoint, you must have adequately completed lesson
  reviews for the associated lesson and all prior lessons.
- Checkpoints may be attempted during our last class of each week (Fridays
  unless we do not meet on Friday).
- Only two scores are possible: 0% and 100%.
- You may re-take checkpoint assessments until you achieve mastery.
- **You are expected to complete all reviews and checkpoints through lesson 32**
  **by the end of the quarter.**

## Tips for Getting the Most from Each Lesson

1. Reading the text isn't enough. Much of the best content is in the
   walk-throughs and videos.
2. Many of the walk-throughs have multiple presentations of the same concept.
   Take advantage. That doesn't mean you have to listen to all of them, but it
   can be enlightening to see a concept or problem from multiple perspectives.
3. The walk-throughs are interactive. Take advantage. Pause and tinker with the
   code. Modify it, run it, and see what happens. Actively experimenting will
   speed up your learning.
4. Solve all the problems. If you're stuck, eventually you'll get hints. Even
   after you solve it, it's helpful to watch several walk-throughs to see how
   others solved the same problem.
5. Take notes as you read / listen / watch, but also take time after a lesson to
   clean up your notes, make connections to previous lessons, and summarize the
   most important points. A running log of what looked important in the moment
   is good; consolidating what you have learned and crystalizing it in a more
   polished artifact is better.
6. Continually assess your knowledge. Be honest with yourself about what you
   **really** understand and push yourself to get to real mastery. You'll go far
   in life if you develop your ability to justly judge your own understanding
   and the fortitude to keep going when it proves lacking.
7. You may safely skip the "CS People" sections.

## Questions by Lesson

### 0. Hello World

Notes:

- Skim this course overview. Many course details are not relevant for us, but be
  sure you understand:
  - how to run code in the playgrounds
  - complete the exercises (debuggin practice, practice problems, and
    lesson-ending "homework" problems)
  - follow the code walk-throughs and switch between alternate versions

0. No review questions for this lesson.

### 1. Variables and Types

1. Write out the pattern for declaring and initializing a variable in a single
   line of code.
2. What happens if you try to use a variable before it is initialized?
3. Why are there multiple types for integer and floating point values?
4. Declaring types is a lot of extra work. What's the advantage of explicit
   types?
5. Explain this claim: "Internally, computers store **everything** as a number."
6. Extension: If everything internally is represented by a number, how does your
   program distinguish or "know" the meaning of `113` (the integer) and `'q'`
   (the character represented by the decimal number 113).

### 2. Operations on Variables (Checkpoint: Variables)

1. Why is this statement nonsense as algebra, but perfectly reasonable as a
   piece of Java code:

   ```
   int i = 10;
   i = i + 1;
   ```

2. In the code above, why does the first line include a type declaration and the
   second line does not? When does an assignment require a type declaration?
   When may a type declaration be omitted?
3. Explain this claim: "assignments in Java are evaluated from _right_ to
   _left_." Use a specific example (or two) to illustrate.

### 3:Conditional Expressions and Statements

1. In Java, what is the difference between the `=` operator and the `==`
   operator?
2. Conditional expressions must always evaluate to what type of value?
3. Write out the pattern for conditional statements.

### 4:Compound Conditionals (Checkpoint: Conditionals)

1. Explain what the `&&` operator does in Java.
2. Explain what the `||` operator does in Java.
3. Create an example that illustrates **short-circuit evalution**.
4. Create an example of a complex conditional that evalutes to true but can be
   made to evaluate to false by adding or changing only parentheses.
5. In a compound conditional **statement**, what's the maximum number of code
   blocks that will execute? What's the minimum? Explain.
6. Explain why this code throws an error on the last line but not the third
   line.

   ```java
   int a = 10;
   if (true) {
       int b = a * 2;
   }
   System.out.println("a: " + a);
   System.out.println("b: " + b);
   ```

### 5:Arrays (Checkpoint: Arrays)

Notes:

- first video is useful -- don't skip it
- the quiz problem at the end of the lesson has nothing to do with arrays. So
  make sure you tackle at least one or two of the extra practice problems (link
  at bottom of the lesson).

1. Label each part of this line of code that declares and initializes an array:
   `int[] values = new int[9];`
2. Suppose you have an array `nums` with 10 values. Show how you'd read its
   first and last values.
3. Show how you'd declare and initialize an array of 5 doubles:
   1. using the keyword `new`
   2. using an array literal

4. Explain how you _update_ a specific value in an array.
5. How many values organized into an array can a Java program read at a time?
   Why is this limitation important to keep in mind as a programmer?

### 6:Loops

1. List the three parts of a `for` loop declaration.
2. Write pseudocode that shows the structure of:
   - `while` loops
   - `for` loops
3. Explain how you would convert a standard `for` loop into a while loop.
4. `for` and `while` loops are more or less interchangeable. But you might
   prefer a `while` loop to a `for` loop if you need to access the loop variable
   outside of the loop body.
   - Explain why.
   - Show how you could construct a `for` loop that gave you access to a loop
     variable outside the `for` loop's body.

### 7:Algorithms I

1. For each of the problems, spend time looking at the different solution
   walkthroughs. It's worth seeing how many ways the problem can be solved. For
   each problem, explain how your preferred solution works and why you like it
   best.
   1. Largest of Three
   2. Game Tiebreaker

### 8:Practice with Loops and Algorithms (Checkpoint: Loops)

Notes:

- Answer the debugging practice question at least 5 times to appreciate the
  various ways you can set up loops to solve even simple problems.

1. What's the difference between `continue` (introduced in this lesson) and
   `break` (introduced in the previous lesson)? When might you use each?
2. The lesson explores a _design pattern_. Describe the pattern and the type of
   problems where it might be useful.

### 9:Functions (Checkpoint: Intro to Functions)

1. In your own words, what is a function? (If you can't put it into your own
   words, what's the explanation or analogy from the lesson that "clicked"
   best?)
2. Write out the pattern or template for defining a function. Be sure to
   include:
   - name
   - inputs (aka arguments, parameters); don't forget the necessary type
     information
   - body
   - return statement
   - return type

3. Which parts of a function are **required**?
4. What's the minimum number of inputs (arguments) a function can take? What's
   the maximum?
5. What does it mean to **call** or **invoke** or **execute** a function? Show
   _how_ to do it.
6. A function's arguments (parameters) are really just special variables.
   Explain _when_ and _how_ they get values assigned to them.
7. We're used to writing a `main` function (method) that has a return type
   `void`. What does that mean?

### 10:Errors and Debugging

Notes:

- You may safely skip the "Staying Sane" section.

1. The lesson divides errors into three broad categories: style errors,
   compile-time errors, and run-time (or testing) errors. Describe each.
2. Special utilities and the Java compiler help you catch and diagnose style and
   compile-time errors. How can you catch run-time errors?
3. What is an `assert` statement and why might it be useful?
4. Write the pattern for an `assert` statement (including the optional error
   message).

### 11:More About Functions

1. Trace the output. Write down exactly what would appear in the console, line
   by line, when this program runs. Then explain why the program executes in the
   order you expect.

   ```java
   boolean isLarge(int num) {
      System.out.println("Checking " + num);
      return num > 50;
   }

   boolean allLarge(int[] numbers) {
      System.out.println("Beginning Scan");
      for (int i = 0; i < numbers.length; i++) {
         if (isLarge(numbers[i])) {
               System.out.println("Large found!");
         } else {
               System.out.println("Small found!");
               return false;
         }
      }
      return true;
   }

   int[] setA = {70, 20, 90};
   System.out.println("Result A: " + allLarge(setA));

   System.out.println("---");

   int[] setB = {100, 80};
   System.out.println("Result B: " + allLarge(setB));
   ```

2. The lesson describes two **very** common patterns when working with arrays:
   the **accumulator** and the **search** patterns. For each, identify:
   - what it achieves (its goal)
   - the basic strategy
   - its pieces / components and how they fit together
   - when you would use it (the kinds of problems it solves)

3. Under what circumstances can a Java program have two functions (two
   _methods_) with the same name? If that function (method) is called, how does
   the Java interpreter decide which function (method) to execute?
4. What is the correct return type of a function that does not return a value?
   Why might such a function nevertheless have a include return statement?

### 12:Practice with Functions

Notes:

This lesson is a chance to reflect on and improve your problem-solving process.
Take advantage! Really try to dissect your approach so you can be intentional
about how to get better. Jot down some record of your process and how you want
to improve it. Writing it down makes it more concrete and in a funny way holds
you accountable. It also hopefully discourages you from being too vauge.

- After you've completed the "Array All Pairs" problem, describe your process.
  What did you do first, second, third, ...? Where did you get stuck?
- Now watch how the instructors build up a solution to the palindrome problem.
  What did they do differently from you? After seeing their process, how might
  you make your own better?
- Put your improved process to work in solving the "Array Range Sum" problem at
  the end of the lesson. Think about what worked and what didn't, but don't be
  too quick to give up on a process if it doesn't work the first time. Practice,
  practice, practice!

1. Write pseudocode that shows the structure of an _enhanced_ `for` loop.
2. When should you prefer an indexed (standard) `for` loop and when should you
   prefer a non-indexed (enhanced) `for` loop?

### 13:Functions and Algorithms (Checkpoint: More Functions)

Notes:

- Work several (or more!) instances of the first debugging problem. It's great
  practice!
- As you solve the practice problems, be intentional about your process. Keep
  practicing and refining it.
- Also be on the lookout for some of the common patterns we've seen. The more
  you look for them, the more you'll see them (and the quicker you'll get at
  spotting them).

1. What pattern is `arrayIsAllLarger` an example of? How does it twist or
   deviate from the basic pattern?
2. What pattern is `arraySum` an example of?
3. What pattern is `catchupGrading` and example of? How does it twist or deviate
   from the basic pattern?

Let's add another learning tool. Watch this short video about the the
[Feynman Technique](https://www.youtube.com/watch?v=FrNqSLPaZLc). Then try it
here. Explain **functions** like you're teaching someone. Go deep, but be clear.
Use simple language and analogies. **DON'T** copy from the the `learncs.online`
lessons, AI generated explanations, or anything else. The goal isn't to be able
to recognize a good explanation; **the goal is to be able to _produce_ a good**
**explanation.** Note what you have difficulty explaining. That's a to-do list
of what you haven't yet mastered and still need to learn.

### 14:Strings

Notes:

- Strings are your first look at Java objects. Objects are super important. So
  don't rush through the walkthroughs that introduce you to objects.
- Also don't skip the video that teaches you how to use Java documenation. The
  video is a little dated. Prof. Challen searches for Java 14 docs. Since that
  video, the backend service that runs your Java code has been updated to
  version 21. Especially for the parts of the language that we'll be using, you
  probably won't find much has changed from v.14 to v.21, but it's still good to
  consult the v.21 docs.

1. List all the String methods you used in the practice problems.
2. Look up the documentation for the `startsWith` method on the `String` class.
   Here's an example of **method overloading**. For both versions:
   - list the argument(s) and its(their) types
   - list the return type
3. Show two ways to declare and initialize a `String`, one using a _literal_ and
   the other using the `new` keyword.
4. Show how to concatenate strings using the `+` operator.
5. Now scan the documentation. What method(s) are available for string
   concatenation?
6. Show how to use _dot notation_ to call (one of) the method(s) you discovered
   in #5.
7. What happens if you try to use dot notation to call a method that does not
   exist on the object? For example, suppose `name` is a `String`. What would
   happen if you tried to execute `name.methodThatDoesNotExist()`?
8. Explain the statement: a Java object "combines state and behavior, or data
   and functionality." Examples may help. This is a first step toward producing
   a Feynman Technique-like explanation. I expect you'll have lots of gaps. So
   an important part of your answer may be a list of questions you have about
   objects. Framing good questions is an enormously important tool for learning.

### 15:Algorithms and Strings

Notes:

- The walkthrough for the "String Character Search" problem is long. Follow
  along anyway, maybe even to two versions. It walks you step by step through
  the process of designing an algorithm, implementing it, and testing both (the
  algorithm and the implementation).
- Prof. Challen's "String Character Search" walkthrough is especially good in
  showing you how to reduce a novel problem into a more familiar pattern. It's
  also a nice example of how to articulate the part of the implementation that
  is unfamiliar in such a way that you can search the documentation or ask a
  good question.

1. Explain what it means to **cast** from one type to another. Provide a few
   examples of casts that will succeed and indicate what the value will be after
   casting.
2. In your own words, what does it mean to say that a `String`s are _immutable_?
3. Describe Prof. Challen's strategy in the "String Character Search" problem.
   By _strategy_, I **don't** mean the algorithm's steps or the concrete
   implementation of that algorthm, but rather a higher-level generalization.
   (Two problems could be solved using the same strategy without the algorithms
   or implementations being exactly the same.)
4. Notice that #3 asked you to do something similar to the Feynman Technique.
   You can only boil down the essence of his solution and clearly communicate it
   if you've really understood how and why it works. Practice some more:
   describe the strategy you employed in solving "String Flip Halves"

### 16:null

1. What kind of types can be assigned a value of `null`?
2. What is the problem with `null` values?
3. What can you do to guard against the problems caused by `null` values?
4. `arrayMax` and `arrayCountGreaterThan` have a lot in common. Describe their
   common characteristics and then describe how they differ.

### 17:Practice with Strings (Checkpoint: Strings)

Notes:

- Do try the homework problem (Caesar cipher / ROT-13) on your own first. Use
  the process you've been refining. If you get truly stuck, follow the
  walk-throughs. They stop short of the complete solution. You'll need to take
  the code an extra step or two to finish the job.
- Even if you don't get stuck, follow the walk-throughs and compare your
  solution to the solution they develop.
- Do solve the bonus problem (`rotateRight`). It's good practice.

1. What was the process you followed to get a solution. Not "what was the
   process I _should have_ or _intended_ to follow". What was your **actual**
   process including all the false starts and shortcuts and set backs. Keep
   track as you go.
2. Jot down one or two things you learned from the walk-throughs that you think
   you might be able to use in future problems.
3. Write an incisive description of your solution to the encryption problem. (2
   sentences max, but it should capture the essesnce of your solution.)

### 18:Multidimensional Arrays (Checkpoint: Multidimensional Arrays)

Notes:

- Again, don't skimp on the debugging practice. Even when the fix is silly, you
  get practice reading code and gain familiarity with different `String`
  methods.

1. Audio tracks, spreadsheet data, and images can be represented as
   two-dimensional arrays (arrays of arrays). What else might be representable
   with multidimensional arrays? Come up with one or two new examples and
   explain.
2. Write pseudocode that shows the pattern for declaring and initializing a
   two-dimensional array. Note how the pattern changes if you use a literal to
   initialize the array. Include whatever notes you need to understand how to do
   it.
3. Explain what happens if you do not specify the size of the inner arrays when
   creating a two-dimensional array?
4. Suppose you have a two-dimensional array `arr`. Show how you would:
   - Get the number of arrays contained by `arr`.
   - Get the length of a particular array contained by `arr`.
   - Use indices to access a value.
   - Set a value.
5. We've learned several patterns for array traversal problems when working with
   one-dimensional arrays. You'll also need to be very comfortable traversing
   two-dimensional arrays. Write pseudocode that shows the pattern traversing a
   two-dimensional array. Make sure your approach is flexible enough to handle
   non-rectangular and "jagged" two-dimensional arrays (arrays whose inner
   arrays have unequal lengths).
