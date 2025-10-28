
import math

def main():
    N = int(input())
    min_value = 0
    for i in range(5):
        if i == 0:
            min_value = int(input())
        else:
            min_value = min(min_value, int(input()))
    print(int(math.ceil(N / min_value) + 4))

if __name__ == "__main__":
    main()

