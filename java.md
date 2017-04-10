# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-4. Complete the following tasks: (~180 mins)

- [Seconds](seconds/Seconds.java)
- [Count A-s](countas/CountAs.java)
- [Pirates](pirates/Pirates.java)
- [Box](box/Box.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

### How can you generate a random number? [2p]
#### Your answer: [add your answer here]

To generate a random number we can use an API called Math.random(). This generates a random double value, which is:
  - greater than or equals to 0.0
  - and less than 1.0
 It is something like this: 0 <= Math.random() < 1.0
Examples:
(1) returns a random integer between 0 and 9
    (int) (Math.random() * 10)
(2) returns a random integer between 50 and 99
    50 + (int) (Math.random()) * 50) ---> where the first 50 gives the lower bound
(3) returns a random number a and a+b, excluding a+b
    a + Math.random() * b
