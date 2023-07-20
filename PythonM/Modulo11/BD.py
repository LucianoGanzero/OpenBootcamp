import sqlite3

conn = sqlite3.connect('alumnosDB.db')
cursor = conn.cursor()

data = cursor.execute('SELECT * FROM alumnos')
for row in data:
    print(row)


#conn.commit()
cursor.close()
conn.close()