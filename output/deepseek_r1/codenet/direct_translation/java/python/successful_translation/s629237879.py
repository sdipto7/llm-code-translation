
n = int(input())
existing = {input().strip() for _ in range(n)}
suits = ['S', 'H', 'C', 'D']
for suit in suits:
    for num in range(1, 14):
        s = f"{suit} {num}"
        if s not in existing:
            print(s)

