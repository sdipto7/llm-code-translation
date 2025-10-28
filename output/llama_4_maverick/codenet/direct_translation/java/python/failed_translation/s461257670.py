
def answer(y, m, d):
    result = 1
    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d
