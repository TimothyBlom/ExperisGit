const fizzbuzz = (n) => {
    for (i = 1; i <= n; i++) {
        if (i % 3 == 0 && 1 % 5 ==0)
            console.log(i + " FizzBuzz");
        if (i % 3 == 0)
            console.log(i + " Fizz");
        if (i % 5 == 0)
            console.log(i + " Buzz");
        if (i % 3 != 0)
            console.log(i);
    }
};

fizzbuzz(100)