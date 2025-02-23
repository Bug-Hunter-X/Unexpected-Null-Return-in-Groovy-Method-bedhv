# Groovy Null Return Bug

This repository demonstrates a common but subtle bug in Groovy related to null return values from methods that don't explicitly return a value in all conditional branches.  The bug occurs because if the `if` condition is true, a value is returned, however, if the `if` condition is false, Groovy does not implicitly return 0 or any other default value, but rather returns `null`. 

The `bug.groovy` file contains the buggy code, and the `bugSolution.groovy` provides the fix. 