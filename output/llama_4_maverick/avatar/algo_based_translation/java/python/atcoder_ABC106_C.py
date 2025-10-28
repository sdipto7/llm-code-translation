
def main():
    str = input().strip()
    c = list(str)
    k = int(input().strip())
    n = len(str)
    for i in range(min(k, n)):
        if c[i] == '1':
            if i == k - 1:
                print(1)
                return
        else:
            print(c[i])
            return

if __name__ == "__main__":
    main()

