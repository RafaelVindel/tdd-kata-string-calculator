# tdd-kata-string-calculator

__1__. Create a simple `StringCalculator` with a method `int add(string numbers)`.
The method can take zero, one or two positive numbers separated by coma and will return their sum (for an empty string it will return 0). For example:
    - "" -> (0)
    - "1" -> (1)
    - "1,2" -> (3)

__2__. Allow the `add` method to handle an unknown amount of numbers.

__3__. Allow the `add` method to handle new lines between numbers (instead of commas). For example:
    - the following input is ok:  "1\n2,3" -> (6)
    - the following input is __NOT__ ok:  "1,\n" (not need to prove it, just clarifying)
