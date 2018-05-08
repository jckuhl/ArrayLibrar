# Array Library

## Introduction
I started learning Java as prep for a job interview.  I'm not sure I even like working in this language.  I opened up the Array documentation and was shocked to find so little there, and decided to start making a library that would be about as expansive as the Array.prototype in native JavaScript.

Working in Java generics is making my head spin.  I'm going to post what I have, I seem to be unable to get this to work for numbers at the moment.  Not sure if I'll come back.

All methods currently included do work (but they haven't been thoroughly tested) on at minimum string arrays.

## Usage
Simply include the ArrayLibrary.java in your working folder.  Maybe later I'll make into a proper package.  Call a method as follows

```java
ArrayLibrary.push(myArray, value); //pushes a value onto an array
```

There are a few differences between these methods and the JavaScript native methods.  Namely, none of them mutate the array they work on.

## ArrayLibrary.push(array, value);
Returns a new array with the given value added to the end

## ArrayLibrary.pop(array);
Returns a new array with the last value popped off.

## ArrayLibrary.slice(array, start, stop);
Returns a new array with the values from the __start__ index to the __stop__ index.  If the __stop__ index is omitted, it'll go to the end of the array.

## ArrayLibrary.concat(array1, array2);
Returns a new array with both the values of __array1__ and __array2__ in one single array.

## ArrayLibrary.removeOnce(array, value);
Returns a new array with the given value removed at it's first occurance.  (I do intend for a removeAll later on).

## ArrayLibrary.includes(array, value);
Returns a true or false, if the value is present

## ArrayLibrary.indexOf(array, value);
Returns the index of the position for the given value, or a -1 if it is not found.