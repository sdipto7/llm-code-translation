
def main():
    n = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    c = 1
    for i in lst:
        if i >= c:
            c += 1
    print(c - 1 if n > 0 and lst[0] > 1 else c)

if __name__ == "__main__":
    main()

