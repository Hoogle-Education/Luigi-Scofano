p, r = input().split()

print(type(p))
print(type(r))

p = int(p)
r = int(r)

print(type(p))
print(type(r))

if p == '0':
    print('C')
elif r == '0':
    print('B')
else:
    print('A')
