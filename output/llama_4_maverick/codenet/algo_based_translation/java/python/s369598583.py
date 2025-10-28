
def main():
    N = int(input())
    count = 0
    next_num = 10
    i = 1
    while i <= N:
        count += 1
        if i == next_num - 1:
            i = next_num * 10 - 1
            next_num *= 100
        i += 1
    print(count)

if __name__ == "__main__":
    main()

