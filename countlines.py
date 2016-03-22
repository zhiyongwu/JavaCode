#-*- encoding:utf-8 -*-
import os,os.path,time

start = time.time()
rootdir,count = ".",0
for parent, dirnames, filenames in os.walk(rootdir):
	for filename in filenames:
		filename = parent+ '/' + filename
		if os.path.splitext(filename)[1] == '.java':
			with open(filename,'r',encoding='utf8',errors='ignore') as f:
				for line in f.readlines():
					if '//' not in line and '/*' not in line and '*/' not in line\
					and line != chr(10) and line != '\n' and line != '':
						if len(line.strip()) > 0 and line.strip()[0] != '*':
							count += 1
print('代码行数',count,sep=':')
print('耗时',time.time() - start,sep=':')