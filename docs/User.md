# Dokumentasi API - Manajemen User

Dokumentasi ini berisi daftar *endpoint* untuk mengelola data User pada aplikasi Praktikum 1.

---

## 1. Create / Add
Menambahkan data user baru ke dalam database. ID akan di-*generate* secara otomatis menggunakan format UUID.

* URL: /api/users
* Method: POST
* Header:
    * Content-Type: application/json
    * Accept: application/json

Request Body
{
"name": "Pradipta Putra",
"age": 21
}

Hasil Sukses
{
"status": "success",
"data": {
"id": "9903e84c-05db-46ce-ab0e-03366010d1db	",
"name": "Pradipta Putra",
"age": 21
}
}

## 2. Get Data
Mendapatkan daftar seluruh user yang ada di dalam database.

---

* URL: /api/users
* Method: GET
* Header:
    * Accept: application/json

Hasil Sukses
{
"status": "success",
"data": [
{
"id": "9903e84c-05db-46ce-ab0e-03366010d1db",
"name": "Pradipta Putra",
"age": 21
},
{
"id": "999f088e-116e-4a8c-8829-4647cb10a507",
"name": "Ifa Asmarani",
"age": 21
}
}

## 3.Update Data
Memperbarui nama dan/atau umur dari user yang sudah ada di database berdasarkan ID.

---

* URL: /api/users/id
* Method: PUT
* Header:
    * Content-Type: application/json
    * Accept: application/json
* Path : ID (UUID) dari user yang ingin diperbarui.

Request Body
{
"name": "Pradipta Pratama Putra (Updated)",
"age": 21
}

Hasil Sukses
{
"status": "success",
"data": {
"id": "9903e84c-05db-46ce-ab0e-03366010d1db",
"name": "Pradipta Pratama Putra (Updated)",
"age": 21
}
}

## 4. Delete Data
Menghapus data user dari database berdasarkan ID.

---

* URL: /api/users/id
* Method: DELETE
* Header:
    * Content-Type: application/json
    * Accept: application/json
* Path: ID (UUID) dari user yang ingin dihapus.

Hasil Jadi
{
"status": "success delete user with id 9903e84c-05db-46ce-ab0e-03366010d1db"
}