// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

package solana.storage.ConfirmedBlock;

public interface CompiledInstructionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana.storage.ConfirmedBlock.CompiledInstruction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 program_id_index = 1;</code>
   * @return The programIdIndex.
   */
  int getProgramIdIndex();

  /**
   * <code>bytes accounts = 2;</code>
   * @return The accounts.
   */
  com.google.protobuf.ByteString getAccounts();

  /**
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}