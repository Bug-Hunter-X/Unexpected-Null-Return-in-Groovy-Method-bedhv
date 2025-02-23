```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // This line is problematic
  }
  // ... rest of your code
}

assert myMethod(null) == 0
assert myMethod(5) == 10 // This assert might fail depending on the code you omitted
```