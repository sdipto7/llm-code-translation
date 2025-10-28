Here is the Python code:


s = input().strip()
result = []
for c in s:
    if c == '0':
        result.append('0')
    elif c == '1':
        result.append('1')
    elif c == 'B':
        if result:
            result.pop()
print(''.join(result))

