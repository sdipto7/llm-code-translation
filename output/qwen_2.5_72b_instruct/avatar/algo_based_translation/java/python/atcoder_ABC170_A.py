
import sys

def main():
    import sys
    input_array = input().strip().split()
    result = 0
    for str in input_array:
        result += 1
        if str == "0":
            break
    print(result)

if __name__ == "__main__":
    main()

