n = int(input())
p_part = list(map(int, input().split()))
p = p_part[0]
x = p_part[1:p+1]
q_part = list(map(int, input().split()))
q = q_part[0]
y = q_part[1:q+1]
combined = set(x + y)
print("I become the guy." if all(i in combined for i in range(1, n+1)) else "Oh, my keyboard!")
