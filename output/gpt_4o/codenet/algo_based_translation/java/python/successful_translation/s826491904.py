
import sys

class Main:
    def __init__(self):
        self.solve()

    def solve(self):
        # Read all input at once
        input_data = sys.stdin.read().split()
        N = int(input_data[0])

        # Initialize max and min with the first number
        max_value = min_value = int(input_data[1])

        # Iterate over the rest of the input numbers
        for i in range(2, N + 1):
            in_value = int(input_data[i])
            max_value = max(max_value, in_value)
            min_value = min(min_value, in_value)

        # Print the difference between max and min
        print(max_value - min_value)

if __name__ == "__main__":
    Main()

