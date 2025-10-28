
def main():
    try:
        n = int(input())
        a = list(map(int, input().split()))
        a = sorted(set(a))
        found = False
        for i in range(len(a)):
            if i + 2 < len(a):
                if a[i] + 1 == a[i + 1] and a[i + 1] + 1 == a[i + 2]:
                    found = True
                    break
        print("YES" if found else "NO")
    except Exception as e:
        pass

if __name__ == "__main__":
    main()

