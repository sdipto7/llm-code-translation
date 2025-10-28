def is_latin(c):
    return 'a' <= c <= 'z'

def is_punct(c):
    return c in {'.', ',', '!', '?'}

s = input()
if not s:
    print('')
    exit()

result = [s[0]]

for i in range(1, len(s)):
    c = s[i]
    if is_latin(c):
        prev_char = s[i-1]
        if not is_latin(prev_char):
            result.append(' ')
        result.append(c)
    elif is_punct(c):
        result.append(c)

print(''.join(result))
