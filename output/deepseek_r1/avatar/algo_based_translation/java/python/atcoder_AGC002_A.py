
a, b = map(int, input().split())
if a > 0:
    print("Positive")
elif b >= 0:
    print("Zero")
else:
    count = b - a + 1
    print("Positive" if count % 2 == 0 else "Negative")

