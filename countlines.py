import os
import os.path

rootdir = "."
count = 0
for parent, dirnames, filenames in os.walk(rootdir):
    # for dirname in dirnames:
    #     print(dirname)
    for filename in filenames:
    	filename = parent+ '/' + filename
    	if 'java' in filename:
        	file = open(filename,'r')
       		for line in file.readlines():
       			if '//' not in line and '/*' not in line and '*/' not in line and line != chr(10) and line != '\n' and line != '':
        			count += 1
print(count)


# file = open('./src/Java/chapter1/exam/Welcome.java','r')
# for line in file.readlines():
# 	print(line)