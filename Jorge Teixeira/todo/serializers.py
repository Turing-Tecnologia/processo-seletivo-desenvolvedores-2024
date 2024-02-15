from todo.models import Todo
from rest_framework import serializers


class TodoSelializer(serializers.ModelSerializer):
    class Meta:
        model = Todo
        fields = "__all__"
