h, a = map(int, input().split())
print(h // a + (0 if h % a == 0 else 1))
