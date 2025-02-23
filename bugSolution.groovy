```groovy
def myMethod(param) {
  if (param == null) {
    return 0
  } else {
    return param * 2 // Or whatever your calculation is
  }
}

assert myMethod(null) == 0
assert myMethod(5) == 10
```