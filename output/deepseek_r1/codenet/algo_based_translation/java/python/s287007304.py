
def read_line():
    try:
        return input()
    except Exception as e:
        return str(e)

if __name__ == "__main__":
    s = read_line().split()
    a = int(s[0])
    b = int(s[1])
    if b % a == 0:
        print(a + b)
    else:
        print(b - a)

