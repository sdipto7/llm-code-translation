
def main():
    try:
        n = int(input().strip())
        a = list(map(int, input().strip().split()))
        swapCount = 0
        for i in range(len(a)):
            mini = i
            for j in range(i, len(a)):
                if a[j] < a[mini]:
                    mini = j
            if mini != i:
                a[mini], a[i] = a[i], a[mini]
                swapCount += 1
        ans = str(a[0])
        for i in range(1, len(a)):
            ans += " " + str(a[i])
        print(ans)
        print(swapCount)
    except Exception as e:
        pass

if __name__ == "__main__":
    main()

