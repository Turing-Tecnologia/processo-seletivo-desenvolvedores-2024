from django.urls import path

from todo import views

urlpatterns = [
    path("", views.todo_list),
    path("<int:pk>", views.todo_detail_and_todo_delete),
]
