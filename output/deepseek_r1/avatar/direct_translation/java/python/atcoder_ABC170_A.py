input_array = input().split()
result = 0
for s in input_array:
    result += 1
    if s == '0':
        break
print(result)
