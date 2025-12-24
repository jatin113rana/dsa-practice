class CountDigits:
    def __init__(self):
        input1 = int(input("Enter a number: "))
        self.count_digits(input1)

    def count_digits(self, number):
        count = 0
        number = abs(number)
        if number == 0:
            return 1
        while number > 0:
            number //=10
            count +=1
        print("Number of Digits:",count)


count_digits = CountDigits()


        