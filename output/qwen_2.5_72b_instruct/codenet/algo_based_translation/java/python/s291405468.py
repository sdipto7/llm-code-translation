
import sys

def main():
    input_values = sys.stdin.read().split()
    nextInt1 = int(input_values[0])
    nextInt2 = int(input_values[1])
    modulus = nextInt1 % 500
    if modulus <= nextInt2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

