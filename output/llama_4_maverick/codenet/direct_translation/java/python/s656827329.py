
def main():
    n = int(input())
    a = list(map(int, input().split()))
    count = 1
    now = 0
    bef = 0
    for i in range(1, n):
        if a[i-1] < a[i]:
            now = 1
        elif a[i-1] > a[i]:
            now = -1
        else:
            continue
        if bef == 0:
            bef = now
        if bef != now:
            count += 1
            bef = 0
    print(count)

if __name__ == "__main__":
    n = int(input())
    a = list(map(int, input().split()))
    if n == len(a):
        count = 1
        now = 0
        bef = 0
        for i in range(1, n):
            if a[i-1] < a[i]:
                now = 1
            elif a[i-1] > a[i]:
                now = -1
            else:
                continue
            if bef == 0:
                bef = now
            if bef != now:
                count += 1
                bef = 0
        print(count)

However, the more pythonic and precise translation is 

def main():
    n = int(input())
    a = list(map(int, input().split()))
    count = 1
    trend = 0
    for i in range(1, n):
        if a[i-1] != a[i]:
            new_trend = 1 if a[i] > a[i-1] else -1
            if trend != 0 and new_trend != trend:
                count += 1
                trend = 0
            else:
                trend = new_trend
    print(count)

if __name__ == "__main__":
    main()
 
can be further optimized into 

n = int(input())
a = list(map(int, input().split()))
count = 1
trend = 0
for i in range(1, n):
    if a[i-1] != a[i]:
        new_trend = 1 if a[i] > a[i-1] else -1
        if trend != 0 and new_trend != trend:
            count += 1
            trend = 0
        else:
            trend = new_trend
print(count)

