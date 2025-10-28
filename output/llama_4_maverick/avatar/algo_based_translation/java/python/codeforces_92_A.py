
def main():
    n, k = map(int, input().split())
    i = 1
    req = 1
    while k - req >= 0:
        k -= req
        i += 1
        req = i % n if i % n != 0 else n
    print(k)

if __name__ == "__main__":
    main()

