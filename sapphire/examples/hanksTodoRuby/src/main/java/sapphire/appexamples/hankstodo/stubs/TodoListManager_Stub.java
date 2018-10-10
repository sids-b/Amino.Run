/*
 * Stub for class sapphire.appexamples.hankstodo.TodoListManager
 * Generated by Sapphire Compiler (sc).
 */
package sapphire.appexamples.hankstodo.stubs;


import org.graalvm.polyglot.Value;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
import sapphire.graal.io.SerializeValue;

public final class TodoListManager_Stub extends sapphire.common.GraalObject implements sapphire.common.AppObjectStub {

    sapphire.policy.SapphirePolicy.SapphireClientPolicy $__client = null;
    boolean $__directInvocation = false;

    public TodoListManager_Stub () {super();}

    public void $__initialize(sapphire.policy.SapphirePolicy.SapphireClientPolicy client) {
        $__client = client;
    }

    public void $__initialize(boolean directInvocation) {
        $__directInvocation = directInvocation;
    }

    public Object $__clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void $__initializeGraal(sapphire.app.SapphireObjectSpec spec, java.lang.Object[] params){
        try {
            super.$__initializeGraal(spec, params);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }

    }

    // Implementation of newTodoList(String)
    public java.lang.Object newTodoList(java.lang.String $param_String_1) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                java.util.ArrayList<Object> objs = new java.util.ArrayList<>();
                objs.add($param_String_1);
                $__result = super.invoke("new_todo_list", objs);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public java.lang.Object sapphire.appexamples.hankstodo.stubs.TodoListManager_Stub.newTodoList(java.lang.String)";
            $__params.add($param_String_1);
            try {
                $__result = $__client.onRPC($__method, $__params);
                if ($__result instanceof SerializeValue) {
                    $__result = deserializedSerializeValue((SerializeValue)$__result);
                }
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        return $__result;
    }

    // Implementation of deleteTodoList(String)
    public java.lang.Object deleteTodoList(java.lang.String $param_String_1) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                java.util.ArrayList<Object> objs = new java.util.ArrayList<>();
                objs.add($param_String_1);
                $__result = super.invoke("delete_todo_list", objs);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public java.lang.Object sapphire.appexamples.hankstodo.stubs.TodoListManager_Stub.deleteTodoList(java.lang.String)";
            $__params.add($param_String_1);
            try {
                $__result = $__client.onRPC($__method, $__params);
                if ($__result instanceof SerializeValue) {
                    $__result = deserializedSerializeValue((SerializeValue)$__result);
                }
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        return ($__result);
    }

    // Implementation of addTodo(String,String)
    public java.lang.Object addTodo(java.lang.String $param_String_1, java.lang.String $param_String_2) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                java.util.ArrayList<Object> objs = new java.util.ArrayList<>();
                objs.add($param_String_1);
                objs.add($param_String_2);
                $__result = super.invoke("add_todo", objs);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public java.lang.Object sapphire.appexamples.hankstodo.stubs.TodoListManager_Stub.addTodo(java.lang.String,java.lang.String)";
            $__params.add($param_String_1);
            $__params.add($param_String_2);
            try {
                $__result = $__client.onRPC($__method, $__params);
                if ($__result instanceof SerializeValue) {
                    $__result = deserializedSerializeValue((SerializeValue)$__result);
                }
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        return ($__result);
    }

    // Implementation of getTodos(String)
    public java.lang.Object getTodos(java.lang.String $param_String_1) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                java.util.ArrayList<Object> objs = new java.util.ArrayList<>();
                objs.add($param_String_1);
                $__result = super.invoke("get_todos", objs);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public java.lang.Object sapphire.appexamples.hankstodo.stubs.TodoListManager_Stub.getTodos(java.lang.String)";
            $__params.add($param_String_1);
            try {
                $__result = $__client.onRPC($__method, $__params);
                if ($__result instanceof SerializeValue) {
                    $__result = deserializedSerializeValue((SerializeValue)$__result);
                }
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        return ($__result);
    }

    // Implementation of completeTodo(String,String)
    public java.lang.Object completeTodo(java.lang.String $param_String_1, java.lang.String $param_String_2) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                java.util.ArrayList<Object> objs = new java.util.ArrayList<>();
                objs.add($param_String_1);
                objs.add($param_String_2);
                $__result = super.invoke("complete_todo", objs);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public java.lang.Object sapphire.appexamples.hankstodo.stubs.TodoListManager_Stub.completeTodo(java.lang.String,java.lang.String)";
            $__params.add($param_String_1);
            $__params.add($param_String_2);
            try {
                $__result = $__client.onRPC($__method, $__params);
                if ($__result instanceof SerializeValue) {
                    $__result = deserializedSerializeValue((SerializeValue)$__result);
                }
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        return ($__result);
    }
}