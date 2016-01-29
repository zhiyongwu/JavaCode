#-*-encoding:utf-8-*-
import os
import os.path

rootdir = "."
count = 0
for parent, dirnames, filenames in os.walk(rootdir):
	for filename in filenames:
		filename = parent+ '/' + filename
		if filename.split('.')[2] == 'java':
			file = open(filename,'r',encoding='utf8',errors='ignore')
			for line in file.readlines():
				if '//' not in line and '/*' not in line and '*/' not in line and line != chr(10) and line != '\n' and line != '':
					count += 1
print(count)


