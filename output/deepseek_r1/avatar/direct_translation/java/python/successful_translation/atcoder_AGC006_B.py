n, x = map(int, input().split())
max_val = 2 * n - 1
if x == 1 or x == max_val:
    print("No")
else:
    print("Yes")
    sequence = [(x + n - 1 + i) % max_val + 1 for i in range(max_val)]
    print('\n'.join(map(str, sequence)))
