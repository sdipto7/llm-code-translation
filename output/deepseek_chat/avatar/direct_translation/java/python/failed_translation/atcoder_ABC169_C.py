
a = int(input())
b = input()
b_char = list(b)
b_str = ""
for char in b_char:
    if char != '.':
        b_str += char
b_int = int(b_str)
result = (a * b_int) // 100
print(result)

