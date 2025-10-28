
def revpos(p, q):
    vec = [0, 0]
    for i in range(len(vec)):
        vec[i] = p[i] - q[i]
    vec[0], vec[1] = vec[1], -vec[0]
    newpos = [0, 0]
    for i in range(len(newpos)):
        newpos[i] = q[i] + vec[i]
    return newpos
