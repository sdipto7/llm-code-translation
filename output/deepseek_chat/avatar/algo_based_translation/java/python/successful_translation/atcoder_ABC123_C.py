import math

def main():
    N = int(input())
    min_val = 0
    for i in range(5):
        if i == 0:
            min_val = int(input())
        else:
            num = int(input())
            min_val = min(min_val, num)
    result = math.ceil(N / min_val) + 4
    print(result)

if __name__ == "__main__":
    main()
